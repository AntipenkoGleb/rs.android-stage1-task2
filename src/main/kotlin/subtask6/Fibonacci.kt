package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var prev = 0
        var current = 1

        var step = 1
        while (step <= n) {
            val newCurrent = prev + current
            prev = current
            current = newCurrent
            if (prev * current >= n) {
                return intArrayOf(prev, current, if (prev * current == n) 1 else 0)
            }
            step++
        }
        return intArrayOf()
    }
}
