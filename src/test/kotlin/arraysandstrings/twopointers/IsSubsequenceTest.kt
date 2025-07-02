package arraysandstrings.twopointers

import org.junit.jupiter.api.Assertions
import kotlin.test.Test

internal class IsSubsequenceTest {
    @Test
    fun isSubsequenceTestPositive() {
        Assertions.assertTrue(IsSubsequence.isSubsequence("ace", "abcde"))
    }

    @Test
    fun isSubsequenceTestNegative() {
        Assertions.assertFalse(IsSubsequence.isSubsequence("acf", "abcde"))
    }
}