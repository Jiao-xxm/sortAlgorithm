package BubbleSort;

/**
 * 冒泡排序
 */

public class BubbleSort {

    public static int[] bullueSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }

            }

        }
        return array;

    }

    public static void main(String[] args) {
        int [] arr = {0,41,5,5,866,47};
        int [] sorted = bullueSort(arr);
        for (int i:sorted
             ) {
            System.out.print(i+" ");
        }

    }
}