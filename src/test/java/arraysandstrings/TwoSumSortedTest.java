package arraysandstrings;

import org.junit.jupiter.api.Test;

import static arraysandstrings.TwoSumSorted.checkForTarget;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumSortedTest {

    @Test
    void checkForTargetTestPositive() {
        assertTrue(checkForTarget(new int[]{1, 2, 4, 6, 8, 9, 12, 15}, 9));
    }

    @Test
    void checkForTargetTestNegative() {
        assertFalse(checkForTarget(new int[]{1, 2, 4, 6, 9, 10, 12, 15}, 9));
    }
}