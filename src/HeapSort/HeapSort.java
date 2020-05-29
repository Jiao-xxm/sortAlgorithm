package HeapSort;

/**
 * 堆排序
 */
public class HeapSort {


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void heapify(int[] tree, int n, int i) {
        if (i >= n) {//如果根节点大于节点的个数，直接跳出，结束递归
            return;
        }
        int c1 = 2 * i + 1; //当前选定根节点的左子节点
        int c2 = 2 * i + 2; //当前选定根节点的右子节点
        int max = i; //假定当前根节点是该子堆的最大值
//         * 找出子堆中的最大值，交换index
        if (c1 < n && tree[c1] > tree[max]) {
            max = c1; //如果左子节点大于根节点元素，交换其下标
        }
        if (c2 < n && tree[c2] > tree[max]) {
            max = c2; //如果右子节点大于子堆中最大值，交换下标
        }
        if (max != i) {//如果最大值不是根节点，交换找到的最大值和根节点元素
            swap(tree, max, i);//交换函数
            heapify(tree, n, max); //递归做heapify,此时如果在主函数中 进行调用只对指定根节点的子堆进行heapifY操作
        }
    }

    /**
     * 对任意数组建立大顶堆
     *
     * @param tree
     * @param n
     */

    private static void build_heap(int[] tree, int n) {
        int last_node = n - 1;//找出完全二叉树的最后一个节点
        int parent = (last_node - 1) / 2;//找出最后一个节点的父节点
        for (int i = parent; i >= 0; i--) {//对树中的所有父节点进行遍历并heapify来得到根节点最大的堆
            heapify(tree, n, i);
        }

    }


    private static void heap_sort(int[] tree, int n) {
        build_heap(tree, n);//把数组建立成一个大顶堆
        int i;
        for (i = n - 1; i >= 0; i--) {
            swap(tree, i, 0);//遍历节点交换最后一个元素和堆最顶端根节点元素
            heapify(tree, i, 0);//交换完成后相当于拿走交换的根节点（最大）再进行heapify操作
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 2, 10, 2};

        heap_sort(arr, arr.length);//heapsort操作后遍历，就相当于从小到大遍历数组
        for (int i : arr) {
            System.out.println(i);
        }

    }

}
