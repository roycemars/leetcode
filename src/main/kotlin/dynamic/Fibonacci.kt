package dynamic

class Fibonacci {
    val memo = mutableMapOf<Int, Int>()

    fun fibonacci(n: Int): Int {
        if (n == 0) {
            return 0
        }

        if (n == 1) {
            return 1
        }

        if (memo.containsKey(n)) {
            return memo.getOrDefault(n, 0)
        }

        memo.put(n, fibonacci(n - 1) + fibonacci(n - 2))

        return memo.getOrDefault(n, 0)
    }
}