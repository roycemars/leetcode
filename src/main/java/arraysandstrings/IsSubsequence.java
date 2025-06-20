package arraysandstrings;

public class IsSubsequence {

    /**
     * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
     * @param s subsequence, example: "ace"
     * @param t string, example: "abcde"
     * @return true if it is subsequence (like "ace"), false if it is not (like "acf")
     */
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }

}
