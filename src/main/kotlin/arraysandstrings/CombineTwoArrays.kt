package arraysandstrings

class CombineTwoArrays {
    companion object {

        /**
         * Problem: Given two sorted integer arrays a and b,
         * return a new array that combines both of them and is also sorted.
         * Approach: Two pointers
         *
         * @param a first array, example: [3, 5]
         * @param b second array, example: [1, 2, 4]
         * @return combined sorted array, example: [1, 2, 3, 4, 5]
         */
        fun combine(a: IntArray, b: IntArray): IntArray {
            val r = IntArray(a.count() + b.count())

            var i = 0
            var j = 0
            var k = 0

            while (i < a.size && j < b.size) {
                if(a[i] < b[j]) {
                    r[k] = a[i]
                    i++
                } else {
                    r[k] = b[j]
                    j++
                }
                k++
            }

            while (i < a.size) {
                r[k] = a[i]
                i++
                k++
            }

            while (j < b.size) {
                r[k] = b[j]
                j++
                k++
            }

            return r
        }
    }
}