package arraysandstrings;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * Example:
 * For example, "ace" is a subsequence of "abcde" while "aec" is not.
 */

public class IsSubsequence {
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
