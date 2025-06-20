package arraysandstrings;

/**
 * Given an array of positive integers nums and an integer k,
 * find the length of the longest subarray whose sum is less than or equal to k.
 */

public class LengthOfLongestSubarray {
    public static int findLength(int [] nums, int k) {
        int left = 0;
        int curr = 0;
        int ans = 0;

        for (int right = 0; right < nums.length - 1; right++) {
            curr += nums[right];

            while (curr > k) {
                curr -= nums[left];
                left++;
            }

            ans = Math.max(ans, right - left - 1);
        }

        return ans;
    }
}
