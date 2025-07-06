package queues

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DailyTemperaturesTest {
    @Test
    fun dailyTemperatures() {
        assertArrayEquals(intArrayOf(4, 2, 1, 1, 0), DailyTemperatures().dailyTemperatures(intArrayOf(40, 35, 32, 37, 50)))
    }

}