package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    @Suppress("IMPLICIT_CAST_TO_ANY")
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        var result = when (blockB) {
            String::class -> ""
            Int::class -> 0
            LocalDate::class -> LocalDate.MIN
            else -> ""
        }
        for (value in blockA) {
            when (value::class) {
                blockB -> when (blockB) {
                    String::class -> result = (result as String).plus(value)
                    Int::class -> result = (result as Int).plus(value as Int)
                    LocalDate::class -> {
                        if ((value as LocalDate) > result as LocalDate)
                            result = value
                    }
                }
            }
        }
        return if (result is LocalDate) result.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) else result
    }

}
