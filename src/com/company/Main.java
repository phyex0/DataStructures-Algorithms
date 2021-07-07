package com.company;

import com.company.DataStructures.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack myStack = new Stack(5);

        for(int i=0;i<5;i++){
            myStack.push(i*10);
            System.out.println(myStack.peek());
        }
        myStack.push(20);

        for(int i=0;i<5;i++)
            System.out.println(myStack.pop());
        System.out.println(myStack.pop());


    }
}
