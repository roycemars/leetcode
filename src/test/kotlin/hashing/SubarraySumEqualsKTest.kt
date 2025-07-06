package hashing

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SubarraySumEqualsKTest {
    @Test
    fun solve() {
        assertEquals(4, SubarraySumEqualsK().solve(intArrayOf(1, 2, 1, 2, 1), 3))
    }

}