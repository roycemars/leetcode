package utils;

public class Utils {
    public static void print(int[] r) {
        System.out.print("r = {");
        for (int i = 0; i < r.length; i++) {
            System.out.printf("%d%s", r[i], i < r.length - 1 ? " " : "");
        }
        System.out.print("}\n");
    }
}
