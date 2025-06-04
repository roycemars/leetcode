package utils;

public class Utils {
    public static void print(int[] r) {
        System.out.print("r = {");
        for (int i = 0; i < r.length; i++) {
            System.out.printf("%d%s", r[i], i < r.length - 1 ? " " : "");
        }
        System.out.print("}\n");
    }

    public static void printTestResult(boolean isValid, int[] r) {
        printTestResult(isValid);
        System.out.print("Output = {");
        for (int i = 0; i < r.length; i++) {
            System.out.printf("%d%s", r[i], i < r.length - 1 ? " " : "");
        }
        System.out.print("}\n");
    }

    public static void printTestResult(boolean isValid) {
        System.out.printf("Result: %s\n", isValid ? "Success" : "Error");
    }
}
