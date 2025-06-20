package java.arraysandstrings;

import org.junit.jupiter.api.Test;

import static java.arraysandstrings.IsSubsequence.isSubsequence;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsSubsequenceTest {

    @Test
    void isSubsequenceTestPositive() {
        assertTrue(isSubsequence("ace", "abcde"));
    }

    @Test
    void isSubsequenceTestNegative() {
        assertFalse(isSubsequence("acf", "abcde"));
    }
}