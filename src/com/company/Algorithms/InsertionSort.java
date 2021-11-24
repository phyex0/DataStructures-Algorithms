package com.company.Algorithms;

/*
 *
 *   Best case : o(n) where all sorted.
 *   Worst case : o(n^2)
 *   Average case : o(n^2)
 *
 */


public class InsertionSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            //Insert arr[i] into sorted sequence.
            int j = i - 1;
            while (j >= 0 && arr[j] >= key)
                arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
    }
}
