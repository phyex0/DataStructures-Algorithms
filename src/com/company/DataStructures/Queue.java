package com.company.DataStructures;

public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;


    public Queue(int size) {
        this.size = size;
        arr = new int[this.size];
    }
}
