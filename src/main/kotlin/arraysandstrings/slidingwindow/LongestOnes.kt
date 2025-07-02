package arraysandstrings.slidingwindow

import kotlin.math.max

class LongestOnes {

    /**
     * Given a binary array nums and an integer k,
     * return the maximum number of consecutive 1's in the array
     * if you can flip at most k 0's.
     */
    fun longestOnes(nums: IntArray, k: Int): Int {
        var (l, r) = 0 to 0
        var zero = 0
        var res = 0

        while (r < nums.size) {
            if (nums[r++] == 0) zero++
            if (zero > k && nums[l++] == 0) zero--
            res = max(res, r - l)
        }

        return res
    }
}