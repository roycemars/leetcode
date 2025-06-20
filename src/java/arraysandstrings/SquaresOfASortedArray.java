package java.arraysandstrings;

public class SquaresOfASortedArray {

    /**
     * Given an integer array a sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
     * @param a input array, sorted in non-decreasing order, example: [-7,-3,2,3,11]
     * @return array of squares, sorted in non-decreasing order, example: [4,9,9,49,121]
     */
    public static int[] sortedSquares(int[] a) {
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
