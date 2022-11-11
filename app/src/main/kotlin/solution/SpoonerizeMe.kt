package solution

/*
 * Spoonerize Me
 * 7 kyu
 * https://www.codewars.com/kata/56b8903933dbe5831e000c76
 */

fun spoonerizeMe(words: String): String {
    return words.split(" ").reversed().joinToString(" ")
}
