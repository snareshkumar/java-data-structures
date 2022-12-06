package linkedlist.singlelinkedlist;

public class CreateLinkedList {

    Node firstNode = null;
    Node lastNode = null;

    static class Node {
        int data;
        Node next = null;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addNode(int data) {

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

        if (currentNode == null) {
            System.out.println("There is no element is the linked list");
            return;
        } else {
            while (currentNode != null) {
                System.out.print(currentNode.data + "->");
                currentNode = currentNode.next;
            }
        }

    }

    public void traverseMNodeAndDeleteNNode(int m, int n) {

        Node currentNode = firstNode;

        System.out.println("Traversing " + m + " nodes");
        if (currentNode == null) {
            System.out.println("Linked list is empty");
            return;
        }

        // Skip M nodes, by default its pointing to first element

        for (int i = 1; i < m && currentNode != null; i++) {
            currentNode = currentNode.next;
        }

        System.out.println("current node value after skipping" + m + " nodes" + currentNode.data);

        // Delete N nodes
        Node t = currentNode.next; // Get next node into t object

        for (int i = 1; i <= n && currentNode != null; i++) {
            if (t != null) {
                Node temp = t;
                System.out.println("deleting node value is " + temp.data);
                t = t.next;
            } else {
                System.out.println("Reached end of linked list, no element to delete");
            }
        }

        currentNode.next = t;
        currentNode = t;

    }

    public static void main(String[] args) {
        CreateLinkedList list = new CreateLinkedList();

        list.displayNodes();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        list.displayNodes();
        list.traverseMNodeAndDeleteNNode(2, 1);
        list.displayNodes();

    }

}
