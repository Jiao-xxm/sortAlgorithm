package CountingSort;

import java.util.Arrays;

public class CountSort {
    public static int[] CountingSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        int bias, min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {//找出未排序数组中最大的数
                max = array[i];
            }
            if (array[i] < min) {//找出未排序数组中最小的数
                min = array[i];
            }
        }
        bias = 0 - min;  //确定位差
        int[] bucket = new int[max - min + 1]; //申请一个最大值与最小值范围个数的新数组
        Arrays.fill(bucket, 0);//初始化数组，使用Arrays 将初始值0全部复制，省略了繁琐的for循环
        for (int i = 0; i < array.length; i++) {
            bucket[array[i] + bias]++;   //将对应的数据加上位差后在新数组上对应后计数，并将计数结果保存在新数组中
        }
        int index = 0, i = 0;//初始化数组的索引
        while(index<array.length){
            if(bucket[i] != 0){
                array[index] = i - bias;  //将新数组的下标加上位差后重新填充到待排序数组
                bucket[i]--; //每取出一个将该位置上的计数减一
                index++; //待排序数组的下表索引加一
            }else{
                i++; //如果将新数组i索引上的计数清零，就将新数组下标i索引+1
            }
        }
        return array;//返回重新填充的待排序数组 ，此时该数组已经有序

    }
    public static void main(String[] args) {
        int [] arr = {2,4,8,5,3};
        int [] sorted = CountingSort(arr);
        for (int i:sorted
        ) {
            System.out.print(i+" ");
        }

    }

}
