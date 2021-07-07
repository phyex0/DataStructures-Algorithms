package com.company.Algorithms;

/*
*   Binary Search:
*   Best case           = o(1)
*   Average case        = o(log(n))
*   Worst case          = o(log(n))
*
*
*   Making a search on sorted array.
* */


public class BinarySearch {

    public static int binarySearch(int[] arr,int val){
        int index=-1, left = 0, right=arr.length, mid;

        while(right>1){
            mid = 1+(left-right)/2;

            if(arr[mid]== val)
                index= mid;

            else if(arr[mid] > val)
                left--;

            else
                right--;


        }

        return index;


    }
}
