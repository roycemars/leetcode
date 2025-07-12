package arraysandstrings.prefixsum

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RunningSumTest {
    @Test
    fun runningSum() {
        assertArrayEquals(intArrayOf(1,3,6,10), RunningSum().runningSum(intArrayOf(1,2,3,4)))
    }

}