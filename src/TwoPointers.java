public class TwoPointers {

    public static void main(String[] args) {
        int[] a = {3, 5}, b = {1, 2, 4};

        int[] r = combine(a, b);
        
        Utils.print(r);
    }

    public static int[] combine(int[] a, int[] b) {
        int[] r = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
//            System.out.printf("a[%d]=%d, j[%d]=%d", i, a[i], j, b[j]);
            if (a[i] < b[j]) {
                r[k] = a[i];
                i++;
            } else {
                r[k] = b[j];
                j++;
            }
//            System.out.printf(", k[%d]=%d\n", k, r[k]);
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
