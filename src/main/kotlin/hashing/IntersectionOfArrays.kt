package hashing

class IntersectionOfArrays {
    fun intersection(nums: Array<Array<Int>>): Array<Int> {
        val counts = mutableMapOf<Int, Int>()

        for (arr in nums) {
            for (x in arr) {
                counts.put(x, counts.getOrDefault(x, 0) + 1)
            }
        }

        val n = nums.size
        val ans = mutableListOf<Int>()
        for (key in counts.keys) {
            if (counts[key] == n) {
                ans.add(key)
            }
        }

        ans.sort()
        return ans.toTypedArray()
    }
}