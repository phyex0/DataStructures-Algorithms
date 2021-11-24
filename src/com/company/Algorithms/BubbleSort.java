package com.company.Algorithms;

/*
 *   Bubble Sort:
 *   Best case       = O(n)
 *   Average case    = O(n^2)
 *   Worst case      = O(n^2)
 *
 *   This algorithm sorts the array min to max. If current item is greater than the next it swaps.
 */

public class BubbleSort {

    public static void sort(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }

    }

    //swaps the elements.
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
