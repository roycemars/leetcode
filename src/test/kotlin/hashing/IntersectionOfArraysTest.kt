package hashing

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class IntersectionOfArraysTest {
    @Test
    fun intersection() {
        assertArrayEquals(arrayOf(3, 4), IntersectionOfArrays().intersection(arrayOf(arrayOf(3, 1, 2, 4, 5), arrayOf(1, 2, 3, 4), arrayOf(3, 4, 5, 6))))
    }

}