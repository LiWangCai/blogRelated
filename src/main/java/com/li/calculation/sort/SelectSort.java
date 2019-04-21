package com.li.calculation.sort;

import java.util.Arrays;

//选择排序
public class SelectSort {
    public static void selectSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            Utils.swap(arr, i, min);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 6};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
