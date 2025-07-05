package hashing

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CheckEqualFrequencyTest {
    @Test
    fun checkEqualFequencyPositive() {
        assertTrue(CheckEqualFrequency().checkEqualFequency("abacbc"))
    }

    @Test
    fun checkEqualFequencyNegative() {
        assertFalse(CheckEqualFrequency().checkEqualFequency("aaabb"))
    }

}