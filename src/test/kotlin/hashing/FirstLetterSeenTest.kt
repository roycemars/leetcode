package hashing

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FirstLetterSeenTest {
    @Test
    fun findFirstLetterSeen() {
        assertEquals('c', FirstLetterSeen().findFirstLetterSeen("abcdecf"))
    }

}