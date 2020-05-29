package InsertionSort;
/**
 * 插入排序

 */
public class InsertionSort {

    public static int[] insertionSort(int[] array){
        if(array.length == 0){
            return array;
        }
        int current;
        for (int i =0;i<array.length-1;i++){
            current =array[i+1];
            int preIndex =i;
            while (preIndex>=0&&current<array[preIndex]){
                array[preIndex+1] =array[preIndex];
                preIndex--;
            }
            array[preIndex+1]= current;
        }
        return array;
    }


    public static void main(String[] args) {
        int [] arr = {0,41,45,5,45,47};
        int [] sorted = insertionSort(arr);
        System.out.println("插入排序如下：");
        for (int i:sorted
        ) {
            System.out.print(i+" ");
        }
    }
}
