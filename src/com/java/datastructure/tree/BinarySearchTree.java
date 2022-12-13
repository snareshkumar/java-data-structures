package com.java.datastructure.tree;

public class BinarySearchTree {

    static class Node {

        Node leftNode;
        Node righNode;
        int data;

        Node(int data) {
            this.leftNode = null;
            this.righNode = null;
            this.data = data;
        }
    }

    public void insertNode(Node node, int data) {

        if (data < node.data) {
            if (node.leftNode == null) {
                node.leftNode = new Node(data);
            } else {
                insertNode(node.leftNode, data);
            }
        }
        if (data > node.data) {
            if (node.righNode == null) {
                node.righNode = new Node(data);
            } else {
                insertNode(node.righNode, data);
            }
        }

    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.leftNode);
            System.out.print(" " + node.data);
            traverseInOrder(node.righNode);
        }
    }

    public static void main(String[] args) {

        BinarySearchTree searchTree = new BinarySearchTree();
        Node root = new Node(5);

        searchTree.insertNode(root, 10);
        searchTree.insertNode(root, 3);
        searchTree.insertNode(root, 15);
        searchTree.insertNode(root, 16);
        searchTree.insertNode(root, 1);
        searchTree.insertNode(root, 2);

        searchTree.traverseInOrder(root);

    }

}
