package com.company.DataStructures;

/*
 *   Linked List:
 *   Random access is not simple like the arrays
 *   Linked List has unlimited size. It depending your memory.
 *
 *   Inserting to head           = o(1)
 *   Inserting to end            = o(1)
 *   Inserting to given index    = o(n)
 *   Deleting given item         = o(n)
 *   Reversing the list          = o(n)
 *   Searching an item           = o(n)
 *
 */

public class LinkedList {

    Node root;
    Node tail;
    public LinkedList() {
        this.root = null;
        this.tail = null;
    }

    //inserting data to end of list.
    public void insertToEnd(int val) {
        if (root == null) {
            root = new Node(val);
            tail = root;
            tail.next = null;
        } else {
            tail.next = new Node(val);
            tail = tail.next;
            tail.next = null;

        }
    }

    //inserting data to head of list.
    public void insertToHead(int val) {
        Node temp = new Node(val);
        if (root == null) {
            root = temp;
            tail = root;
            tail.next = null;
        } else {
            temp.next = root;
            root = temp;
        }

    }

    //inserting data to given index;
    public void insertToIndex(int index, int val) {
        Node temp = new Node(val);
        Node iter = root;
        int len = lenOfList();

        if (index < 0 || index > len)
            System.out.println("You cannot insert to given position: " + index);

        else if (index == 0)
            insertToHead(val);

        else if (index <= len) {
            for (int i = 0; i < index - 1; i++)
                iter = iter.next;
            temp.next = iter.next;
            iter.next = temp;
        }
    }

    //returns length of the list.
    public int lenOfList() {
        Node iter = root;
        int count = 0;
        while (iter != null) {
            count++;
            iter = iter.next;
        }
        return count;
    }

    //printing list
    public void print() {

        Node iter = root;

        while (iter != null) {
            System.out.println(iter.val);
            iter = iter.next;
        }

    }

    //deleting item
    public void deleteItem(int val) {
        boolean isHere = false;
        Node iter = root;
        Node temp = null;
        if (root.val == val) {
            temp = root;
            root = root.next;
            temp = null;
            isHere = true;
            return;
        }

        while (iter.next != null) {
            if (iter.next != null && iter.next.val == val) {
                temp = iter.next;
                iter.next = temp.next;
                temp = null;
                isHere = true;
                break;
            }
            iter = iter.next;
        }
        if (!isHere)
            System.out.println("Given item is not element of the list.");


    }

    //reverse the list
    public void reverseList() {
        LinkedList reverseList = new LinkedList();
        Node iter = root;

        while (iter != null) {
            reverseList.insertToHead(iter.val);
            iter = iter.next;
        }

        root = reverseList.root;
        tail = reverseList.tail;
    }

    //if the given value exists in the list it returns true else it's false
    public boolean isExists(int val) {
        Node iter = root;
        boolean result = false;

        while (iter != null) {
            if (iter.val == val) {
                result = true;
                break;
            }
            iter = iter.next;

        }

        return result;
    }

    class Node {
        int val;
        Node next;


        public Node(int val) {
            this.val = val;
            next = null;
        }

    }


}
