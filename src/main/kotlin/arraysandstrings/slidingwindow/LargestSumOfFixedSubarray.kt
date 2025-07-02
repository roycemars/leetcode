package arraysandstrings.slidingwindow

import kotlin.math.max

class LargestSumOfFixedSubarray {
    fun findLargestSumOfSubarray(a: IntArray, k: Int): Int {
        var curr = 0

        for (i in 0..k - 1) {
            curr += a[i]
        }
        var res = curr

        for (i in k..a.size - 1) {
            curr = curr + a[i] - a[i - k]
            res = max(res, curr)
        }

        return res
    }
}