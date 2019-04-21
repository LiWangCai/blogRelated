package com.li.calculation.sort;

import java.util.Arrays;


//堆排序
public class HeapSort {
    private static int leftChild(int i) {
        return i * 2 + 1;
    }

    private static void percDown(int[] a, int i, int n) {
        int child;
        int temp;

        for (temp = a[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);
            if (child != n - 1 && a[child] < a[child + 1]) {
                child++;
            }
            if (temp < a[child]) {
                a[i] = a[child];
            }
            else
                break;
        }
        a[i] = temp;
    }

    public static void heapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            percDown(arr, i, arr.length);
        }
        for (int i = arr.length - 1; i > 0; i--) {
            Utils.swap(arr, 0, i);
            percDown(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 5, 3, 6, 4};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
