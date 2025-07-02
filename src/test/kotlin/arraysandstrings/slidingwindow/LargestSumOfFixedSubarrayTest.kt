package arraysandstrings.slidingwindow

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LargestSumOfFixedSubarrayTest {
    @Test
    fun findLargestSumOfSubarray() {
        assertEquals(18, LargestSumOfFixedSubarray().findLargestSumOfSubarray(intArrayOf(3, -1, 4, 12, -8, 5, 6), 4))
    }

}