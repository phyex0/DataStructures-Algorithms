package com.company.Algorithms;

/*
 *  Divide and conquer algorithm
 *
 *   Time complexity:
 *      Best case o(nlog(n))
 *      Average case o(nlog(n))
 *      Worst case (n^2)
 *
 *  Stack usage:
 *      Best case O(log(n))
 *      Worst case O(n)
 *
 */
public class QuickSort {

    public static void sort(int[] arr, int head, int tail) {
        if (head < tail) {
            int pivot = partition(arr, head, tail);
            sort(arr, head, pivot);
            sort(arr, pivot + 1, tail);

        }
    }


    private static int partition(int arr[], int head, int tail) {
        int pivot = head;
        while (head < tail) {
            while (head < arr.length && arr[pivot] >= arr[head])
                ++head;
            while (tail > 0 && arr[pivot] < arr[--tail]) ;
            if (head < tail)
                swap(arr, head, tail);
        }

        swap(arr, pivot, tail);
        return tail;
    }


    private static void swap(int[] arr, int head, int tail) {
        int temp = arr[head];
        arr[head] = arr[tail];
        arr[tail] = temp;
    }
}