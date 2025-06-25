package arraysandstrings

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

internal class IsSubsequenceTest {
    @Test
    fun isSubsequenceTestPositive() {
        assertTrue(IsSubsequence.isSubsequence("ace", "abcde"))
    }

    @Test
    fun isSubsequenceTestNegative() {
        assertFalse(IsSubsequence.isSubsequence("acf", "abcde"))
    }
}