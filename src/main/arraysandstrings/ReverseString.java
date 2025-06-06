package main.arraysandstrings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Coding interview";

        String r = reverse(s);

        System.out.printf("\"%s\" reversed is \"%s\"\n", s, r);
    }

    private static String reverse(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;

        while (i < j) {
            char c = a[i];

//            System.out.printf("a[%d] = %c; c=%c; a[%d]=%c\n", i, a[i], c, j, a[j]);
            a[i] = a[j];
            a[j] = c;
            i++;
            j--;
        }
        return String.valueOf(a);
    }
}
