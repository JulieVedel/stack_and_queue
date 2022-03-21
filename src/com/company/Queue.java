package com.company;

public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    /** Construct a queue with the default capacity 16 */
    public Queue() {
        this(DEFAULT_CAPACITY);
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    /** Construct a queue with the specified maximum capacity */
    public Queue(int capacity) {
        elements = new int[capacity];
        size = 0;
    }

    /** Insert a new integer into the queue */
    public void offer(int value) {
        elements[size] = value;
        size++;
    }


    /** Return and remove the element from the queue */
    public int remove() {
        int element = elements[0];
        for (int i = 1; i < elements.length; i++) {
            elements[i - 1] = elements[i];
        }
        size--;
        System.out.println("Remove the next element in the queue: " + element);
        return element;
    }

    /** Return the element from the queue, which has been in the queue longest time */
    public int peek() {
        return elements[0];
    }

    /** Test whether the queue is empty */
    public boolean empty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    /** Return the number of elements in the queue */
    public int getSize() {
        return size;
    }

}
