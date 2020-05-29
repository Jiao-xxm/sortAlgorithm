package MergeSort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {

    public static int[] mergeSort(int[]array){

        if(array.length<2){
            return array;
        }
        int mid = array.length/2;
        int []left = Arrays.copyOfRange(array,0,mid);
        int []right = Arrays.copyOfRange(array,mid,array.length);
        return merge(mergeSort(left),mergeSort(right));



    }
    /**
     *
     * 归并排序--将 两段排序好的数组合成一个排序数组
     *
     */
    public static int[]merge(int[]left,int[]right){
        int[] result = new int[left.length+right.length];//新建一个可以容纳左右数组的新数组
        for (int index = 0,i=0,j=0;index<result.length;index++){
            if(i>=left.length){
                result[index]=right[j++];

            }else if(j>=right.length){
                result[index] = left[i++];

            }else if(left[i]>right[j]){
                result[index]=right[j++];
            }else {
                result[index]=left[i++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {465,56,4,4,5,334,7,7,165};
        int [] sorted = mergeSort(arr);
        System.out.println("归并排序如下：");
        for (int i:sorted
        ) {
            System.out.print(i+" ");
        }
    }
}
