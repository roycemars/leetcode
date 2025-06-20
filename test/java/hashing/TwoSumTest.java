package java.hashing;

import org.junit.jupiter.api.Test;

import static java.hashing.TwoSum.twoSum;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    void twoSumTestPositive() {
        assertArrayEquals(new int[]{0, 4},
                twoSum(new int[]{5, 2, 7, 10, 3, 9}, 8),
                "Two sum positive test");
    }

    @Test
    void twoSumTestNegative() {
        assertArrayEquals(new int[]{-1, -1},
                twoSum(new int[]{5, 2, 7, 10, 7, 9}, 8),
                "Two sum negative test");
    }
}