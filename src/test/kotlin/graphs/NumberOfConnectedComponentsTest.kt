package graphs

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberOfConnectedComponentsTest {
    @Test
    fun countComponents() {
        assertEquals(2, NumberOfConnectedComponents().countComponents(5, edges = arrayOf( intArrayOf(0,1), intArrayOf(1,2), intArrayOf(3,4))))
    }

}