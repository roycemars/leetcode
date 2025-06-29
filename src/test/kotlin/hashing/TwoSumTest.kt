package hashing

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TwoSumTest {
    @Test
    fun twoSumPositiveTest() {
        assertArrayEquals(intArrayOf(0, 4),
            TwoSum().twoSum(intArrayOf(5, 2, 7, 10, 3, 9), 8))
    }

    @Test
    fun twoSumNegativeTest() {
        assertArrayEquals(intArrayOf(-1, -1),
            TwoSum().twoSum(intArrayOf(5, 2, 7, 10, 7, 9), 8))
    }
}