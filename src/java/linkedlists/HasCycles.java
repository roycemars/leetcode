package java.linkedlists;

public class HasCycles {
    public static class Node {
        int d;
        Node next;

        public Node(int d) {
            this.d = d;
        }
    }

    public static boolean hasCycles(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
