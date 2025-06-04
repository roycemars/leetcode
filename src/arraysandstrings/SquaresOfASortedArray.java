package arraysandstrings;

import java.util.Arrays;
import static utils.Utils.printTestResult;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * Example:
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 * Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */
public class SquaresOfASortedArray {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        int[] input = {-7,-3,2,3,11};
        int[] expectedOutput = {4,9,9,49,121};

        int[] output = sortedSquares(input);

        printTestResult(Arrays.equals(output, expectedOutput), output);
    }

    private static int[] sortedSquares(int[] a) {
        int n = a.length;
        int[] r = new int[n];
        int left = 0, right = n - 1, pos = n - 1;

        while (left <= right) {
            int leftSquare = a[left] * a[left];
            int rightSquare = a[right] * a[right];

            if(leftSquare > rightSquare) {
                r[pos] = leftSquare;
                left++;
            } else {
                r[pos] = rightSquare;
                right--;
            }
            pos--;
        }

        return r;
    }
}
