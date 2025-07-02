package arraysandstrings.twopointers

class TwoSumSorted {

    /**
     * Approach: Two pointers
     */
    fun checkForTarget(a: IntArray, t: Int): Boolean {
        var l = 0
        var r = a.size - 1

        while (l < r) {
            val s = a[l] + a[r]

            if (s == t) {
                return true
            }

            if (s > t) {
                r--
            } else {
                l++
            }
        }

        return false
    }
}