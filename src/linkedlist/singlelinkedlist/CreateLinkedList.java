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

    public static void main(String[] args) {
        CreateLinkedList list = new CreateLinkedList();

        list.displayNodes();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        list.displayNodes();

    }

}
