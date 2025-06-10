package linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DoublyLinkedListTest {

    @Test
    void addNode() {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);

        DoublyLinkedList.Node first = list.getHead();
        assertNotNull(first);
        assertEquals(1, first.val);

        DoublyLinkedList.Node second = first.next;
        assertNotNull(second);
        assertEquals(2, second.val);
        assertEquals(first, second.prev);
        assertEquals(second, first.next);

        DoublyLinkedList.Node third = second.next;
        assertNotNull(third);
        assertEquals(3, third.val);
        assertEquals(second, third.prev);
        assertEquals(third, second.next);
    }
}