package com.company;

public class Stack{
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    /** Construct a stack with the default capacity 16 */
    public Stack() {
        this(DEFAULT_CAPACITY);
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    /** Construct a stack with the specified maximum capacity */
    public Stack(int capacity) {
        elements = new int[capacity];
        size = 0;
    }

    /** Push a new integer into the top of the stack */
    public void push(int value) {
        elements[size] = value;
        size++;
    }


    /** Return and remove the top element from the stack */
    public int pop() {
        size--;
        int element = elements[size];
        System.out.println("Remove the top element from the stack: " + element);
        return element;
    }

    /** Return the top element from the stack */
    public int peek() {
        return elements[size - 1];
    }

    /** Test whether the stack is empty */
    public boolean empty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    /** Return the number of elements in the stack */
    public int getSize() {
        return size;
    }
}

