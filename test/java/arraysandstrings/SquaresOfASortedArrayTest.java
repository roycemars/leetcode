package java.arraysandstrings;

import org.junit.jupiter.api.Test;

import static java.arraysandstrings.SquaresOfASortedArray.sortedSquares;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SquaresOfASortedArrayTest {

    @Test
    void sortedSquaresTest() {
        assertArrayEquals(new int[]{4,9,9,49,121},
                sortedSquares(new int[] {-7,-3,2,3,11}),
                "Sorted squares test");
    }
}