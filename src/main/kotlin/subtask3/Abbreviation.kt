package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val result = b.toMutableList()
        var step = 0
        while (step < a.length && result.isNotEmpty()) {
            if (a.toUpperCase()[step] == result[0])
                result.removeAt(0)
            step++
        }
        return if (result.isEmpty()) "YES" else "NO"
    }
}
