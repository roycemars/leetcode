package arraysandstrings.slidingwindow

import org.junit.jupiter.api.Assertions
import kotlin.test.Test

class LengthOfLongestSubarrayTest {
  @Test
  fun lengthOfLongestSubarrayTest() {
      Assertions.assertEquals(2, LengthOfLongestSubarray.Companion.findLength(intArrayOf(3, 1, 2, 7, 4, 2, 1, 1, 5), 8))
  }
}