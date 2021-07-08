package com.company;

import com.company.DataStructures.Queue;
import com.company.DataStructures.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Queue myQueue = new Queue(5);

        for(int i=0;i<5;i++){
            myQueue.enqueue(i*10);
            System.out.println(myQueue.peek());
        }
        myQueue.enqueue(20);

        for(int i=0;i<5;i++)
            System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());


    }
}
