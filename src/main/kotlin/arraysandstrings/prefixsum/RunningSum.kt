package arraysandstrings.prefixsum

class RunningSum {
    fun runningSum(nums: IntArray): IntArray {
        if (nums.size <= 1) {
            return nums
        }

        val r = IntArray(nums.size)
        r[0] = nums[0]

        for (i in 1 .. nums.size - 1) {
            r[i] = r[i - 1] + nums[i]
        }

        return r
    }
}