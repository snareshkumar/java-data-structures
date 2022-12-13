package com.java.datastructure.array;

public class StackDemo {

    int size;
    int top = 0;
    int arr[];

    StackDemo(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int data) {

        if (isFull()) {
            System.out.println("Stack is already full, cannot insert new element");
        } else {
            System.out.println("Inserting the element into the position top " + top);
            arr[top++] = data;
        }

    }

    public void pop() {

        if (isEmpty()) {
            System.out.println("stack is empty, cannot delete any element");
        } else {
            int element = arr[--top];
            System.out.println("Removing top element in the position " + element);

        }

    }

    public void display() {

    }

    private boolean isFull() {
        return top == size;
    }

    private boolean isEmpty() {
        return top == 0;
    }

    public static void main(String[] args) {

        StackDemo stackDemo = new StackDemo(5);

        stackDemo.push(10);
        stackDemo.push(20);
        stackDemo.push(30);
        stackDemo.push(40);
        stackDemo.push(50);

        stackDemo.push(60);

        stackDemo.pop();
        stackDemo.pop();
        stackDemo.pop();
        stackDemo.pop();
        stackDemo.pop();

        stackDemo.pop();

    }

}
