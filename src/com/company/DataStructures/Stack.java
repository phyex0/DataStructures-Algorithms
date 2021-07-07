package com.company.DataStructures;

/*
*   Stack:
*   Inserting           = o(1)
*   Removing            = o(1)
*   Peeking             = o(1)
*   Checking capacity   = o(1)
*
*   In stack, first in, last out. Due to structure, you cannot take the item which is bottom first.
*
* */

public class Stack {
    private int[] myArray;
    private int size;
    private int index =-1;

    //Constructor of the stack.
    public Stack(int size) {
        this.size = size;
        myArray = new int[size];
    }

    // Checking the stack about being empty.
    public boolean isEmpty(){
        if(index ==-1){
            System.out.println("Stack is empty!");
            return true;
        }
        return false;

    }

    //Checking the stack about being full.
    public  boolean isFull(){
        if(index+1 ==size){
            System.out.println("Stack is full!");
            return true;
        }
        return false;
    }

    //Inserting data.
    public void push(int val){
        if(!isFull())
            myArray[++index]=val;
    }

    //Removing data.
    public int pop(){
        if(!isEmpty())
            return myArray[index--];
        return -1;
    }

    //Returning last item of the stack but it won't be removed.
    public int peek(){
        if(!isEmpty())
            return myArray[index];
        return -1;
    }

    //returns the current size of the stack.
    public int getSize(){
        return index;
    }
}
