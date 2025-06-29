package arraysandstrings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberOfWaysToSplitArrayTest {
    @Test
    fun splitArray() {
        assertEquals(3, NumberOfWaysToSplitArray().splitArray(intArrayOf(10, 4, -8, 7)))
    }

}