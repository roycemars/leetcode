package arraysandstrings.slidingwindow

import kotlin.math.max

class LongestSubstring {

    /**
     * You are given a binary string s (a string containing only "0" and "1").
     * You may choose up to one "0" and flip it to a "1".
     * What is the length of the longest substring achievable that contains only "1"?
     *
     * Approach: Sliding window
     */
    fun findLength(s: String): Int {
        var left = 0
        var zero = 0
        var res = 0

        for (right in 0..s.length - 1) {
            if (s[right] == '0') {
                zero += 1
            }

            while (zero > 1) {
                if (s[left] == '0') {
                    zero -= 1
                }
                left += 1
            }

            res = max(res, right - left + 1)
        }

        return res
    }
}