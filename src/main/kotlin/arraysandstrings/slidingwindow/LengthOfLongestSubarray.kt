package arraysandstrings.slidingwindow

import kotlin.math.max

class LengthOfLongestSubarray {
    companion object {

        /**
         * Problem: Given an array of positive integers nums and an integer k,
         * find the length of the longest subarray whose sum is less than or equal to k.
         * Approach: Sliding window
         *
         * @param a array
         * @param k target sum
         */
        fun findLength(a: IntArray, k: Int): Int {
            var l = 0
            var c = 0
            var res = 0

            for (r in 0 .. a.size - 1) {
                c += a[r]

                while (c > k) {
                    c -= a[l]
                    l++
                }

                res = max(res, r - l - 1)
            }

            return res
        }
    }
}