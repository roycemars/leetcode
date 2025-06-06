package arraysandstrings;

public class CombineTwoArrays {

    /**
     * Given two sorted integer arrays a and b, return a new array that combines both of them and is also sorted.
     * @param a first array, example: [3, 5]
     * @param b second array, example: [1, 2, 4]
     * @return combined sorted array, example: [1, 2, 3, 4, 5]
     */
    public static int[] combine(int[] a, int[] b) {
        int[] r = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                r[k] = a[i];
                i++;
            } else {
                r[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            r[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            r[k] = b[j];
            j++;
            k++;
        }

        return r;
    }
}
