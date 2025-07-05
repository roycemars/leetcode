package hashing

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LongestSubstringTest {
    @Test
    fun findLongestSubstring() {
        assertEquals(3, LongestSubstring().findLongestSubstring("eceba", 2))
    }
}