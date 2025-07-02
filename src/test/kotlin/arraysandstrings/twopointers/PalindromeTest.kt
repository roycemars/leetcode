package arraysandstrings.twopointers

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PalindromeTest {
    @Test
    fun checkIfPalindromeTestPositive() {
        assertTrue(Palindrome.checkIfPalindrome("racecar"))
    }

    @Test
    fun checkIfPalindromeTestNegative() {
        assertFalse(Palindrome.checkIfPalindrome("aceba"))
    }
}