package com.java.datastructure.linkedlist.singlelinkedlist;

public class SearchLinkedList {

    Node firstNode = null;
    Node lastNode = null;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void createNode(int data) {
        Node newNode = new Node(data);
        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }

    public void displayNodes() {

        Node currentNode = firstNode;

        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }

    }

    public int searchElement(int element) {

        Node currentNode = firstNode;

        while (currentNode != null) {
            if (currentNode.data == element) {
                return 1;
            }
            currentNode = currentNode.next;
        }

        return -1;

    }

    public static void main(String[] args) {

        SearchLinkedList obj = new SearchLinkedList();

        obj.createNode(10);
        obj.createNode(20);
        obj.createNode(30);
        obj.createNode(40);
        obj.createNode(50);

        obj.displayNodes();

        int result = obj.searchElement(100);

        if (result == 1) {
            System.out.println("Element found");
        } else {
            System.out.println("not found ");
        }

    }
}
