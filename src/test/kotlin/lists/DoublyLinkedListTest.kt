package lists

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DoublyLinkedListTest {
    @Test
    fun add() {
        val list = DoublyLinkedList()

        list.add(1)
        list.add(2)
        list.add(3)

        val first = list.head
        assertNotNull(first)
        assertEquals(1, first?.value)

        val second = first?.next
        assertNotNull(second)
        assertEquals(2, second?.value)
        assertEquals(first, second?.prev)
        assertEquals(second, first?.next)

        val third = second?.next
        assertNotNull(third)
        assertEquals(3, third?.value)
        assertEquals(second, third?.prev)
        assertEquals(third, second?.next)
    }

}