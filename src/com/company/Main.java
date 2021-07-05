package com.company;

import com.company.Algorithms.BubbleSort;
import com.company.DataStructures.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[]{3,2,1};
        BubbleSort.bubbleSort(arr);
        for(int i:arr)
            System.out.println(i);



    }
}
