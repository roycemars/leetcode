package heap

import java.util.PriorityQueue

class LastStoneWeight {
    fun lastStoneWeight(stones: IntArray): Int {
        val heap = PriorityQueue<Int>(Comparator.reverseOrder())
        for (stone in stones) {
            heap.add(stone)
        }

        while (heap.size > 1) {
            val first = heap.remove()
            val second = heap.remove()
            if (first != second) {
                heap.add(first - second)
            }
        }

        return if (heap.isEmpty()) 0 else heap.remove()
    }
}