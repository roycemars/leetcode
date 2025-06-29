package arraysandstrings

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TwoSumJavaSortedTest {
    @Test
    fun checkForTargetPositiveTest() {
        assertTrue(TwoSumSorted().checkForTarget(intArrayOf(1, 2, 4, 6, 8, 9, 12, 15), 9))
    }

    @Test
    fun checkForTargetNegativeTest() {
        assertFalse(TwoSumSorted().checkForTarget(intArrayOf(1, 2, 4, 6, 9, 10, 12, 15), 9))
    }

}