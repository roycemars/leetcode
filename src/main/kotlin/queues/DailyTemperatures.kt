package queues

import java.util.Stack

class DailyTemperatures {
    /**
     * Given an array of integers temperatures that represents the daily temperatures,
     * return an array answer such that answer[i] is the number of days you have to wait after the
     * ith day to get a warmer temperature.
     * If there is no future day that is warmer, have answer[i] = 0 instead.
     */
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = Stack<Int>()
        val answer = IntArray(temperatures.size)

        for (i in 0..temperatures.size - 1) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                val j = stack.pop()
                answer[j] = i - j
            }

            stack.push(i)
        }

        return answer
    }
}