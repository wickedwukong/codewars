package solution

fun sentenceReverser(words: String): String {
    val splitWords = words.split(" ")

//    val reversedList = splitWords.map(::reversIfLongerThan4)
    val reversedList = splitWords.map { word ->
        if (word.length >= 5) {
            word.reversed()
        } else {
            word
        }

    }

    return reversedList.joinToString(" ")
}

private fun reversIfLongerThan4(word: String): String =
    if (word.length >= 5) {
        word.reversed()
    } else {
        word
    }
