package com.li.calculation.sort;

import java.util.Arrays;

//归并排序
public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int tempArr[] = new int[arr.length];
        mergeSort(arr, tempArr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int[] tempArr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, tempArr, 0, mid);
            mergeSort(arr, tempArr, mid + 1, right);
            merge(arr, tempArr, left, mid + 1, right);
        }
    }

    public static void merge(int[] arr, int[] tempArr, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numEles = rightEnd - leftPos + 1;
        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (arr[leftPos] < arr[rightPos]) {
                tempArr[tmpPos++] = arr[leftPos++];
            }else {
                tempArr[tmpPos++] = arr[rightPos++];
            }
        }
        while (leftPos <= leftEnd) {
            tempArr[tmpPos++] = arr[leftPos++];
        }
        while (rightPos <= rightEnd) {
            tempArr[tmpPos++] = arr[rightPos++];
        }
        for (int i = 0; i < numEles; i++, rightEnd--) {
            arr[rightEnd] = tempArr[rightEnd];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 5, 3, 6, 4};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
