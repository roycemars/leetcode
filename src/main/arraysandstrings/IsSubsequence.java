package main.arraysandstrings;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "ace", t = "abcde";

        boolean r = isSubsequence(s, t);

        System.out.printf("\"%s\" is subsequence of \"%s\": %b\n", s, t, r);
    }

    private static boolean isSubsequence(String s, String t) {
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
