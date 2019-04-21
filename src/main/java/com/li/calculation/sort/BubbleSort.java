package com.li.calculation.sort;

import java.util.Arrays;

//冒泡排序
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j - 1]) {
                    Utils.swap(arr, j, j - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 5, 3, 6, 4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
