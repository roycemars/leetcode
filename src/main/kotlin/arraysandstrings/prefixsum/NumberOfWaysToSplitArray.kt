package arraysandstrings.prefixsum

class NumberOfWaysToSplitArray {
    /**
     * Given an integer array nums, find the number of ways to split the array into two parts so that
     * the first section has a sum greater than or equal to the sum of the second section.
     * The second section should have at least one number.
     *
     * Approach: Prefix sum
     */
    fun splitArray(nums: IntArray): Int {
        var ans = 0
        var leftSection = 0
        var total = 0

        for (n in nums) {
            total += n
        }

        for (i in 0 .. nums.count() - 1) {
            leftSection += nums[i]
            val rightSection = total - leftSection
            if (leftSection >= rightSection) {
                ans++
            }
        }

        return ans
    }
}