package arraysandstrings.slidingwindow

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberOfSubArraysTest {
    @Test
    fun findSubarrays() {
        assertEquals(8, NumberOfSubArrays().findSubarrays(intArrayOf(10, 5, 2, 6), 100))
    }

}