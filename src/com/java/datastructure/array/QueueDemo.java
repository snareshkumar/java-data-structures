package com.java.datastructure.array;

/**
 * Queue - Implementing queue operations
 * 
 * Queue - FIFO(First In First Out)
 * Operations
 * Enqueue -> insert element into the queue
 * Dequeue -> delete element from the queue
 * 
 * 
 */

public class QueueDemo {

    int size;
    int front, rear = 0;
    int arr[];

    QueueDemo(int size) {
        arr = new int[size];
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full, you cannot insert element into the queue");
        } else {
            arr[rear++] = data;
        }

    }

    public void dequeue(int data) {
        if (isEmpty()) {
            System.out.println("Queue is empty, delete operation cannot be performed");
        } else {
            arr[--rear] = data;
        }

    }

    private boolean isEmpty() {
        return front == rear;
    }

    private boolean isFull() {
        return size == rear;
    }

}
