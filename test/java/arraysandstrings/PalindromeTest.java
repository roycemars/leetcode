package java.arraysandstrings;

import org.junit.jupiter.api.Test;

import static java.arraysandstrings.Palindrome.checkIfPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void checkIfPalindromePositive() {
        assertTrue(checkIfPalindrome("racecar"));
    }

    @Test
    void checkIfPalindromeNegative() {
        assertFalse(checkIfPalindrome("aceba"));
    }
}