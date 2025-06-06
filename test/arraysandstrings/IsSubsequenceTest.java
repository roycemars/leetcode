package arraysandstrings;

import org.junit.jupiter.api.Test;

import static arraysandstrings.IsSubsequence.isSubsequence;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsSubsequenceTest {

    @Test
    void isSubsequenceTest() {
        assertTrue(isSubsequence("ace", "abcde"));
    }
}