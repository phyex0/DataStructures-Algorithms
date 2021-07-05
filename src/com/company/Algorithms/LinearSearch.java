package com.company.Algorithms;

/*
*   Linear Search Algorithm:
*   Best case       = O(1)
*   Worst case      = O(n)
*   Average case    = O(n)
*
* If the given item is not in your list it returns -1 otherwise it returns the index that was first found.
*/
public class LinearSearch {

    public static int linearSearch(int[] arr, int val){
        int index=-1;
        for(int i=0;i<arr.length;i++)
            if(arr[i]==val){
                index=i;
                break;
            }

        return index;

    }
}
