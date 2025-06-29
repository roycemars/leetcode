package arraysandstrings

class PrefixSum {
    fun answerQueries(nums: Array<Int>, queries:Array<Array<Int>>, limit: Int): BooleanArray {
        val prefix = IntArray(nums.count())
        prefix[0] = nums[0]

        for (i in 1..nums.count() - 1) {
            prefix[i] = prefix[i - 1] + nums[i]
        }

        val ans = BooleanArray(queries.count())
        for (i in 0..queries.count() - 1) {
            val x = queries[i][0]
            val y = queries[i][1]

            val curr = prefix[y] - prefix[x] + nums[i]
            ans[i] = curr < limit
        }

        return ans
    }
}