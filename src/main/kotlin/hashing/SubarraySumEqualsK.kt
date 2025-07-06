package hashing

class SubarraySumEqualsK {
    /**
     * Given an integer array nums and an integer k, find the number of subarrays whose sum is equal to k.
     */
    fun solve(nums: IntArray, k: Int): Int {
        val counts = mutableMapOf<Int, Int>()
        counts.put(0, 1)

        var res = 0
        var cur = 0

        for (n in nums) {
            cur += n
            res += counts.getOrDefault(cur - k, 0)
            counts.put(cur, counts.getOrDefault(cur, 0) + 1)
        }

        return res
    }
}