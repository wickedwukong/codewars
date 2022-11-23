package solution

/*
 * Spoonerize Me
 * 7 kyu
 * https://www.codewars.com/kata/56b8903933dbe5831e000c76
 */

fun spoonerizeMe(words: String): String {
    val (swappedFirstWord, swappedSecondWord) = swapFirstLetter(getFirstWord(words), getSecondWord(words))

    return "$swappedFirstWord $swappedSecondWord"
}

private fun swapFirstLetter(firstWordChars: MutableList<Char>, secondWordChars: MutableList<Char>, ): Pair<String, String> {
    val temp = firstWordChars[0]

    firstWordChars[0] = secondWordChars[0]
    secondWordChars[0] = temp

    val swappedFirstWord = firstWordChars.joinToString("")
    val swappedSecondWord = secondWordChars.joinToString("")

    return Pair(swappedFirstWord, swappedSecondWord)
}

private fun getSecondWord(words: String) = words.split(" ").last().toCharArray().toMutableList()
private fun getFirstWord(words: String) = words.split(" ").first().toCharArray().toMutableList()

