package SelectionSort;

/**
 * 选择排序
 */

public class selectionSort {
    public static int[] selectionSort(int[]array){
        if(array.length == 0){
            return array;
        }
        for(int i=0;i<array.length;i++){
            int minIndex = i;
            for(int j=i;j<array.length;j++){
                if(array[j]<array[minIndex]){//寻找最小的数
                    minIndex = j;//保存最小值的角标
                }
                /**
                 * 交换最小值与无序序列的第一位
                 */

                int temp =array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }

        return array;
    }


    public static void main(String[] args) {
        int [] arr = {0,41,45,5,45,47};
        int [] sorted = selectionSort(arr);
        System.out.println("选择排序如下：");
        for (int i:sorted
        ) {
            System.out.print(i+" ");
        }
    }
}
