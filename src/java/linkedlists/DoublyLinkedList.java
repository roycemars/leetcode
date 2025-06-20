package java.linkedlists;

/**
 * Implement a doubly linked list 1 <-> 2 <-> 3.
 */

public class DoublyLinkedList {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    public DoublyLinkedList() {}

    public Node getHead() {
        return head;
    }

    public void addNode(int d) {
        Node node = new Node(d);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
}
