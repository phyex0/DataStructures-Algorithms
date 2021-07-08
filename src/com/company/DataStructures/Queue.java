package com.company.DataStructures;
//Todo: Add comments and explanations.
public class Queue {
    private int[] arr;
    private int front=0;
    private int rear=-1;
    private int size;
    private int count=0;

    public Queue(int size) {
        this.size = size;
        arr = new int[this.size];
    }

    private boolean isEmpty(){
        if(count==0){
            System.out.println("Queue is empty!");
            return true;
        }
        return false;
    }

    private boolean isFull(){
        if(count==size){
            System.out.println("Queue is full!");
            return true;
        }
        return false;
    }

    public void enqueue(int val){
        if(!isFull()){
            arr[++rear % size]=val;
            count++;
        }


    }

    public int peek(){
        if(!isEmpty())
            return arr[rear];
        return -1;
    }

    public int dequeue(){
        if(!isEmpty()){
            count--;
            return  arr[front++ % size];
        }
        return -1;
    }


}
