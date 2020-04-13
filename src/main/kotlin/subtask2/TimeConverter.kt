package subtask2

class TimeConverter {

    private val numbers = arrayOf(
        "",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
        "twenty",
        "twenty one",
        "twenty two",
        "twenty three",
        "twenty four",
        "twenty five",
        "twenty six",
        "twenty seven",
        "twenty eight",
        "twenty nine"
    )

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val h = hour.toInt()
        val m = minute.toInt()
        return when (minute.toInt()) {
            0 -> "${numbers[h]} o' clock"
            1 -> "${numbers[m]} minute past ${numbers[h]}"
            15 -> "quarter past ${numbers[h]}"
            in 2..29 -> "${numbers[m]} minutes past ${numbers[h]}"
            30 -> "half past ${numbers[h]}"
            45 -> "quarter to ${numbers[h + 1]}"
            in 31..60 -> "${numbers[60 - m]} minutes to ${numbers[h + 1]}"
            else -> ""
        }
    }
}
