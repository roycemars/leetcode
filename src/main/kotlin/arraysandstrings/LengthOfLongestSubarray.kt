package arraysandstrings

import kotlin.math.max

class LengthOfLongestSubarray {
    companion object {

        /**
         * Problem: Given an array of positive integers nums and an integer k,
         * find the length of the longest subarray whose sum is less than or equal to k.
         * Approach: Sliding window
         */
        fun findLength(a: IntArray, k: Int): Int {
            var left = 0
            var c = 0
            var r = 0

            for (right in 0 .. a.size - 1) {
                c += a[right]

                while (c > k) {
                    c -= a[left]
                    left++
                }

                r = max(r, right - left - 1)
            }

            return r
        }
    }
}