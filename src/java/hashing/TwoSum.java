package java.hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Given an array of integers nums and an integer target, return indices of two numbers such that they add up to target. You cannot use the same index twice.
     * @param a input array, example: [5, 2, 7, 10, 3, 9],
     * @param t target, example: 8
     * @return array of indices of two numbers such that they add up to target, example: [0, 4]
     */
    public static int[] twoSum(int[] a, int t) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int n = a[i];
            int c = t - n;

            if(map.containsKey(c)) {
                int j = map.get(c);
                return new int[]{j, i};
            } else {
                map.put(n, i);
            }
        }

        return new int[]{-1, -1};
    }
}
