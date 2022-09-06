/*
 * Highest Scoring Word
 * 6 kyu
 * https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/kotlin
 */
package solution

fun high(str: String): String = str.split(" ").map {
    val score = it.fold(0) { totalScore: Int, c: Char -> totalScore + c.code - 'a'.code + 1 }
    Pair(it, score)
}.maxByOrNull { it.second }?.first ?: ""
