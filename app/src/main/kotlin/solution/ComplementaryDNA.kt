/*
 * Complementary DNA
 * 7 kyu
 * https://www.codewars.com/kata/554e4a2f232cdd87d9000038/kotlin
 */

package solution

fun makeComplement(dna: String): String = dna.map<Any> { c ->
    when (c) {
        'A' -> "T"
        'T' -> "A"
        'G' -> "C"
        'C' -> "G"
        else -> ""
    }
}.joinToString("")
