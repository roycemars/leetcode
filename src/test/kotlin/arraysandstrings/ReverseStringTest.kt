package arraysandstrings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ReverseStringTest {
    @Test
    fun reverse() {
        assertEquals("weivretni gnidoC", ReverseString().reverse("Coding interview"))
    }

}