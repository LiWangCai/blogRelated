package com.li.calculation.sort;

import java.util.Arrays;

//快速排序
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;
        if (low >= high) {
            return;
        }
        int left =low;
        int right = high;
        //temp就是基准位
        int temp = arr[low];

        while (left < right) {
            //先看右边，依次往左递减
            while (left < right && arr[right] >= temp) {
                right--;
            }
            //再看左边，依次往右递增
            while (left < right && arr[left] <= temp) {
                left++;
            }
            //如果满足条件则交换
            if (left < right) {
                Utils.swap(arr, left, right);
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        Utils.swap(arr, low, left);
        //递归调用左半数组
        quickSort(arr, low, left - 1);
        //递归调用右半数组
        quickSort(arr, left + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 6};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
