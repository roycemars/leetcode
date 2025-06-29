package hashing

class TwoSum {
    /**
     * Given an array of integers nums and an integer target, return indices of two numbers such that they add up to target. You cannot use the same index twice.
     * @param a input array, example: [5, 2, 7, 10, 3, 9],
     * @param t target, example: 8
     * @return array of indices of two numbers such that they add up to target, example: [0, 4]
     */
    fun twoSum(a: IntArray, t: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in 0..a.count() - 1) {
            val n = a[i]
            val c = t - n

            if (map.containsKey(c)) {
                val j = map[c]
                return intArrayOf(j ?: 0, i)
            } else {
                map[n] = i
            }
        }

        return intArrayOf(-1, -1)
    }
}