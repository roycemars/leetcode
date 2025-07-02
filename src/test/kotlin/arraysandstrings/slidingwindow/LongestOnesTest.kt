package arraysandstrings.slidingwindow

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LongestOnesTest {
    @Test
    fun longestOnesTwo() {
        assertEquals(6, LongestOnes().longestOnes(intArrayOf(1,1,1,0,0,0,1,1,1,1,0), 2))
    }

    @Test
    fun longestOnesThree() {
        assertEquals(10, LongestOnes().longestOnes(intArrayOf(0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1), 3))
    }
}