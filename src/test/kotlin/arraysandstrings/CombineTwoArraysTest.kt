package arraysandstrings

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class CombineTwoArraysTest {
    @Test
    fun combineTest() {
        Assertions.assertArrayEquals(
            intArrayOf(1, 2, 3, 4, 5),
            CombineTwoArrays.Companion.combine(intArrayOf(3, 5), intArrayOf(1, 2, 4))
        )
    }
}