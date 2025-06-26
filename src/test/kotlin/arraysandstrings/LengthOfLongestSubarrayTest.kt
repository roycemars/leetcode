package arraysandstrings

import arraysandstrings.LengthOfLongestSubarray.Companion.findLength
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class LengthOfLongestSubarrayTest {
  @Test
  fun lengthOfLongestSubarrayTest() {
      assertEquals(2, findLength(intArrayOf(3, 1, 2, 7, 4, 2, 1, 1, 5), 8))
  }
}