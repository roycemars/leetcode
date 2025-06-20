package arraysandstrings

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LengthOfLongestSubarrayKtTest {
    @Test
    fun findLengthTest() {
        assertEquals(2, findLength(intArrayOf(3, 1, 2, 7, 4, 2, 1, 1, 5).toTypedArray(), 8))
    }

}