package QuickSort;

/**
 * 快速排序方法
 */
public class QuickSort {

    public static void quickSort(int[] array, int left, int right) {
        //如果左边的索引大于右边的索引，出现错误，直接退出该排序方法
        if (left > right) {
            return;
        }
        //确定基准数，以最左开始
        int base = array[left];
        int i = left;
        int j = right;
        while (i != j) {
            while (array[j] >= base && i < j) {
                j--;
            }
            while (array[i] <= base && i < j) {
                i++;
            }

            //代码走到这里意味着在基准条件下找到了符合条件的元素，交换他们
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }
        //i=j此时索引走到一起，交换基准数和相遇位置元素
        array[left] = array[i];
        array[i] = base;
        //一趟快排后继续排左边
        quickSort(array, left, j - 1);
        quickSort(array, j + 1, right);

    }


    public static void main(String[] args) {
        int[] arr = { 0, 41, 45, 5, 45, 47};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr
        ) {
            System.out.print(i + " ");
        }

    }

}