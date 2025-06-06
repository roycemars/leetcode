package hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstLetterSeenTest {

    @Test
    void findFirstLetterSeen() {
        assertEquals('c', FirstLetterSeen.findFirstLetterSeen("abcdecf"), "First letter seen");
    }
}