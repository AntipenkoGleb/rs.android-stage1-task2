package subtask4

class Pangram {

    private val VOWELS = arrayOf('a', 'e', 'i', 'o', 'u', 'y')

    private val CONSONANTS = arrayOf(
        'b',
        'c',
        'd',
        'f',
        'g',
        'h',
        'j',
        'k',
        'l',
        'm',
        'n',
        'p',
        'q',
        'r',
        's',
        't',
        'v',
        'w',
        'x',
        'z'
    )

    private val ALPHABET_LETTERS = VOWELS + CONSONANTS

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        val words = inputString.trim().split(" ").filter { it != "" && it != "\n" }
        val newWords = mutableListOf<String>()

        val capitalizeLetters = if (inputString.toLowerCase().toSet().containsAll(ALPHABET_LETTERS.toList()))
            VOWELS
        else
            CONSONANTS

        for (word in words) {
            var newWord = word
            capitalizeLetters.forEach { newWord = newWord.replace(it, it.toUpperCase()) }
            newWords.add(word.toLowerCase().count { capitalizeLetters.contains(it) }.toString() + newWord)
        }

        newWords.sortBy { it[0] }
        return newWords.joinToString(" ")
    }
}
