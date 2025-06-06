package arraysandstrings;

import org.junit.jupiter.api.Test;

import static arraysandstrings.ReverseString.reverse;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseTest() {
        assertEquals("weivretni gnidoC",
                reverse("Coding interview")
        );
    }
}