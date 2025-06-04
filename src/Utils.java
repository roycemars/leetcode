public class Utils {
    public static void print(int[] r) {
        System.out.printf("r = {");
        for (int i = 0; i < r.length; i++) {
            System.out.printf("%d%s", r[i], i < r.length - 1 ? " " : "");
        }
        System.out.printf("}\n");
    }
}
