package ShellSort;

/**
 * 希尔排序
 */
public class ShellSort {
    public static int[] shellSort(int[]array){
        if(array.length==0){
//            System.out.println("数组为空");
            return array;
        }
        int len = array.length;
        int temp,gap = len/2;
        while (gap>0){
            for (int i = gap; i <len ; i++) {
                temp = array[i];
                int preIndex =i-gap;
                while (preIndex>=0&&array[preIndex]>temp){//分组交换，（插入排序）
                    array[preIndex+gap]=array[preIndex];
                    preIndex -= gap;

                }
                array[preIndex+gap] = temp;
            }
            gap/=2;//缩小步长，继续跳入第一层while 循环
        }



        return array;
    }
    public static void main(String[] args) {
        int [] arr = {465,56,4,4,5,334,7,7,165};
        int [] sorted = shellSort(arr);
        System.out.println("希尔排序如下：");
        for (int i:sorted
        ) {
            System.out.print(i+" ");
        }
    }
}
