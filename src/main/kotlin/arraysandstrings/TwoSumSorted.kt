package arraysandstrings

class TwoSumSorted {
    fun checkForTarget(a: IntArray, t: Int): Boolean {
        var i = 0
        var j = a.count() - 1

        while (i < j) {
            val s = a[i] + a[j]

            if (s == t) {
                return true
            }

            if (s > t) {
                j--
            } else {
                i++
            }
        }

        return false
    }
}