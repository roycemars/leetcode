package arraysandstrings

class SquaresOfASortedArray {
    /**
     * Given an integer array a sorted in non-decreasing order, return an array of the squares of each number
     * sorted in non-decreasing order.
     * Approach: Two pointers
     *
     * @param a input array, sorted in non-decreasing order, example: [-7,-3,2,3,11]
     * @return array of squares, sorted in non-decreasing order, example: [4,9,9,49,121]
     */
    fun sortedSquares(a: IntArray): IntArray {
        val n = a.count()
        val r = IntArray(n)
        var i = 0
        var j = n - 1
        var k = n - 1

        while (i <= j) {
            val ls = a[i] * a[i]
            val rs = a[j] * a[j]

            if (ls > rs) {
                r[k] = ls
                i++
            } else {
                r[k] = rs
                j--
            }

            k--
        }
        return r
    }
}