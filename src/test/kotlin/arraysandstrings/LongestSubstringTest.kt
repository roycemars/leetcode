package arraysandstrings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LongestSubstringTest {
    @Test
    fun findLength() {
        assertEquals(5, LongestSubstring().findLength("1101100111"))
    }

}