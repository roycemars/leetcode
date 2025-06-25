package arraysandstrings

import arraysandstrings.CombineTwoArrays.Companion.combine
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class CombineTwoArraysTest {
    @Test
    fun combineTest() {
        Assertions.assertArrayEquals(
            intArrayOf(1, 2, 3, 4, 5),
            combine(intArrayOf(3, 5), intArrayOf(1, 2, 4))
        )
    }
}