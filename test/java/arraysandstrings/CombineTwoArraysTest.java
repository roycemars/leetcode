package java.arraysandstrings;

import org.junit.jupiter.api.Test;

import static java.arraysandstrings.CombineTwoArrays.combine;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CombineTwoArraysTest {

    @Test
    void combineTest() {
        assertArrayEquals(new int[] {1, 2, 3, 4, 5},
                combine(new int[]{3, 5}, new int[] {1, 2, 4}));
    }
}