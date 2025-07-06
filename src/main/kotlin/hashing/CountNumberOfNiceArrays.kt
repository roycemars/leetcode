package hashing

class CountNumberOfNiceArrays {
    /**
     * Given an array of positive integers nums and an integer k.
     * Find the number of subarrays with exactly k odd numbers in them.
     */
    fun solve(nums: IntArray, k: Int): Int {
        val counts = mutableMapOf<Int, Int>()
        counts.put(0, 1)

        var ans = 0
        var curr = 0

        for (n in nums) {
            curr += n % 2
            ans += counts.getOrDefault(curr - k, 0)
            counts.put(curr, counts.getOrDefault(curr, 0) + 1)
        }

        return ans
    }
}