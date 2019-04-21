package com.li.calculation.sort;

import java.util.Arrays;


//插入排序
public class InsertSort {
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length <= 0)
            return;
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 7, 6};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
