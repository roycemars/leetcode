package utils;

public class Utils {
    public static void print(int[] r) {
        System.out.print("r = {");
        for (int i = 0; i < r.length; i++) {
            System.out.printf("%d%s", r[i], i < r.length - 1 ? " " : "");
        }
        System.out.print("}\n");
    }

    public static void printTestResult(String testName, boolean isValid, int[] r) {
        printTestResult(testName, isValid);
        System.out.print("\tOutput = {");
        for (int i = 0; i < r.length; i++) {
            System.out.printf("%d%s", r[i], i < r.length - 1 ? " " : "");
        }
        System.out.print("}\n");
    }

    public static void printTestResult(String testName, boolean isValid) {
        System.out.printf("%s.\tResult: %s", testName, isValid ? "Success" : "Error");
    }
}
