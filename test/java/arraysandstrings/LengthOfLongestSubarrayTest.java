package java.arraysandstrings;

import org.junit.jupiter.api.Test;

import static java.arraysandstrings.LengthOfLongestSubarray.findLength;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLongestSubarrayTest {

    @Test
    void findLengthTest() {
        assertEquals(2, findLength(new int[]{3, 1, 2, 7, 4, 2, 1, 1, 5}, 8));
    }
}