package linkedlists;

import org.junit.jupiter.api.Test;

import static linkedlists.HasCycles.hasCycles;
import static org.junit.jupiter.api.Assertions.*;

class HasCyclesTest {

    @Test
    void hasCyclesTest() {

        HasCycles.Node node = new HasCycles.Node(1);
        node.next = new HasCycles.Node(2);
        node.next.next = new HasCycles.Node(3);
        node.next.next.next = new HasCycles.Node(4);
        node.next.next.next.next = node;

        assertTrue(hasCycles(node));
    }
}