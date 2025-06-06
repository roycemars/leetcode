package arraysandstrings;

public class ReverseString {
    public static String reverse(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;

        while (i < j) {
            char c = a[i];

            a[i] = a[j];
            a[j] = c;
            i++;
            j--;
        }
        return String.valueOf(a);
    }
}
