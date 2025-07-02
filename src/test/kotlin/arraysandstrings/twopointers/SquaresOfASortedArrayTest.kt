package arraysandstrings.twopointers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SquaresOfASortedArrayTest {
    @Test
    fun sortedSquaresTest() {
        Assertions.assertArrayEquals(
            intArrayOf(4, 9, 9, 49, 121),
            SquaresOfASortedArray().sortedSquares(intArrayOf(-7, -3, 2, 3, 11))
        )
    }

}