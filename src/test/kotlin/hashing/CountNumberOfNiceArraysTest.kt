package hashing

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CountNumberOfNiceArraysTest {
    @Test
    fun solve() {
        assertEquals(2, CountNumberOfNiceArrays().solve(intArrayOf(1, 1, 2, 1, 1), 3))
    }

}