package lists

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HasCyclesTest {
    @Test
    fun hasCycles() {
        val node = HasCycles.Node(1)
        node.next = HasCycles.Node(2)
        node.next?.next = HasCycles.Node(3)
        node.next?.next?.next = HasCycles.Node(4)
        node.next?.next?.next?.next = node

        assertTrue(HasCycles().hasCycles(node))
    }

}