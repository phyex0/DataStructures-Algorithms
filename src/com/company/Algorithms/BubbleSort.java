package com.company.Algorithms;
/*
*  Bubble Sort =
*
*
*
*
*
* */

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int len = arr.length;

        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            }
        }

    }

    //swaps the elements.
    private static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
