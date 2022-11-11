package solution

/*
 * Spoonerize Me
 * 7 kyu
 * https://www.codewars.com/kata/56b8903933dbe5831e000c76
 */

fun spoonerizeMe(words: String): String {
    val split = words.split(" ")
    val firstWord = split.first()
    val secondWord = split.last()

    val firstWordLetters: List<Char> = firstWord.toCharArray().toList() //[a,c]

    val secondWordLetters: List<Char> = secondWord.toCharArray().toList() //[b]

    val firstLetterInFirstWord: Char = firstWordLetters.first() //a
    val firstLetterInSecondWord: Char = secondWordLetters.first() //b


    val swapped1stWord= firstWordLetters.drop(1).reversed().plus(firstLetterInSecondWord).reversed().joinToString("")
    val swapped2ndWord = secondWordLetters.drop(1).reversed().plus(firstLetterInFirstWord).reversed().joinToString("")


    return "$swapped1stWord $swapped2ndWord"
}
