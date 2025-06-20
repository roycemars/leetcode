package java.hashing;

import org.junit.jupiter.api.Test;

import static java.hashing.FirstLetterSeen.findFirstLetterSeen;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstLetterSeenTest {

    @Test
    void findFirstLetterSeenTest() {
        assertEquals('c',
                findFirstLetterSeen("abcdecf"), "First letter seen");
    }
}