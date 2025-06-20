package java.arraysandstrings;

import org.junit.jupiter.api.Test;

import static java.arraysandstrings.ReverseString.reverse;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseTest() {
        assertEquals("weivretni gnidoC", reverse("Coding interview"));
    }
}