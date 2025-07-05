package hashing

import kotlin.math.max

class LongestSubstring {
    /**
     * You are given a string s and an integer k.
     * Find the length of the longest substring that contains at most k distinct characters.
     *
     * Approach: HashMap
     */
    fun findLongestSubstring(s: String, k: Int): Int {
        var left = 0
        var res = 0
        val counts = mutableMapOf<Char, Int>()

        for (right in 0 .. s.length - 1) {
            val c = s[right]
            counts.put(c, counts.getOrDefault(c, 0) + 1)


            while (counts.size > k) {
                val remove = s[left]
                counts.put(remove, counts.getOrDefault(remove, 0) - 1)

                if(counts[remove] == 0) {
                    counts.remove(remove)
                }

                left++
            }

            res = max(res, right - left + 1)
        }

        return res
    }
}