package arraysandstrings

class IsSubsequence {
    companion object {

        /**
         * Problem: Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
         * Approach: Two pointers
         *
         * @param s subsequence, example: "ace"
         * @param t string, example: "abcde"
         * @return true if it is subsequence (like "ace"), false if it is not (like "acf")
         */
        fun isSubsequence(s: String, t: String): Boolean {
            var i = 0
            var j = 0

            while (i < s.length && j < t.length) {
                if(s[i] == t[j]) {
                    i++
                }
                j++
            }

            return i == s.length
        }
    }
}