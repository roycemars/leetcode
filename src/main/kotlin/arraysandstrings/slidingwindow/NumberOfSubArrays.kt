package arraysandstrings.slidingwindow

class NumberOfSubArrays {

    /**
     * Given an array of positive integers nums and an integer k,
     * return the number of subarrays where the product of all the elements in the subarray is strictly less than k.
     *
     * Approach: Sliding window
     */
    fun findSubarrays(nums: IntArray, k: Int): Int {
        if (k <= 1) {
            return 0
        }

        var ans = 0
        var l = 0
        var p = 1

        for (r in 0 .. nums.size - 1) {
            p *= nums[r]

            while (p >= k) {
                p /= nums[l]
                l++
            }

            ans += r - l + 1
        }
        return ans
    }
}