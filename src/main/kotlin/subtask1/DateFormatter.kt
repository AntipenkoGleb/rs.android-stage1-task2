package subtask1

import java.time.LocalDate

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            "$day ${MONTH_OF_YEAR[month]}, ${DAY_OF_WEEK[date.dayOfWeek.value]}"
        } catch (e: Exception) {
            return "Такого дня не существует"
        }
    }

    companion object {
        private val MONTH_OF_YEAR = hashMapOf(
            "1" to "января",
            "2" to "февраля",
            "3" to "марта",
            "4" to "апреля",
            "5" to "мая",
            "6" to "июня",
            "7" to "июля",
            "8" to "августа",
            "9" to "сентября",
            "10" to "октября",
            "11" to "ноября",
            "12" to "декабря"
        )
        private val DAY_OF_WEEK = hashMapOf(
            1 to "понедельник",
            2 to "вторник",
            3 to "среда",
            4 to "четверг",
            5 to "пятница",
            6 to "суббота",
            7 to "воскресенье"
        )
    }
}
