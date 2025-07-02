package arraysandstrings.prefixsum

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PrefixSumTest {
    @Test
    fun answerQueries() {
        Assertions.assertArrayEquals(
            booleanArrayOf(true, false, true),
            PrefixSum().answerQueries(
                arrayOf(1, 6, 3, 2, 7, 2),
                arrayOf(arrayOf(0, 3), arrayOf(2, 5), arrayOf(2, 4)),
                13
            )
        )
    }

}