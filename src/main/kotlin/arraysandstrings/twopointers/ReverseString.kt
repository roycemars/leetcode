package arraysandstrings.twopointers

class ReverseString {
    /**
     * Approach: Two pointers
     */
    fun reverse(s: String): String {
        val a = s.toCharArray()
        var i = 0
        var j = s.length - 1

        while(i < j) {
            val c = a[i]
            a[i] = a[j]
            a[j] = c

            i++
            j--
        }

        return String(a)
    }
}