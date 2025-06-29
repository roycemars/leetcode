package arraysandstrings

class NumberOfWaysToSplitArray {
    /**
     * Given an integer array nums, find the number of ways to split the array into two parts so that
     * the first section has a sum greater than or equal to the sum of the second section.
     * The second section should have at least one number.
     */
    fun splitArray(nums: IntArray): Int {
        val prefix = IntArray(nums.count())

        prefix[0] = nums[0]
        for (i in 1..nums.count() - 1) {
            prefix[i] = prefix[i - 1] + nums[i]
        }

        var ans = 0
        for (i in 0 .. nums.count() - 1) {
            val leftSection = prefix[i]
            val rightSection = prefix[nums.count() - 1] - prefix[i]
            if (leftSection >= rightSection) {
                ans++
            }
        }

        return ans
    }
}