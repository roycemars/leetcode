package hashing

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GroupAnagramsTest {
    @Test
    fun solve() {
        val e = arrayOf(arrayOf("eat","tea", "ate"), arrayOf("tan", "nat"), arrayOf("bat"))
        val a = GroupAnagrams().solve(arrayOf("eat","tea","tan","ate","nat","bat"))
        assertArrayEquals(e,
            a)
    }

}