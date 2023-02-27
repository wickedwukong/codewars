package solution

/*
 * Roman Numerals Encoder
 * 6 kyu
 * https://www.codewars.com/kata/51b62bf6a9c58071c600001b/train/kotlin
 */

fun encode(num: Int): String {
    tailrec fun encodeAux(num: Int, acc: String): String =
        if (num == 0) acc else {
            val (k, v) = numerals.first { it.second <= num }
            encodeAux(num - v, acc + k)
        }
    return encodeAux(num, "")
}

val numerals = listOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I").zip(
    listOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
)
fun encode2(num: Int): String {

    val digitInThousand = num / 1000
    val hundreds = (num % 1000) / 100
    val digitInTens = (num % 1000 % 100) / 10
    val lastDigit = num % 1000 % 100 % 10

    val thousandInRomanNumeral = thousand(digitInThousand)
    val hundredInRomanNumeral = hundred(hundreds)
    val tensInRomanNumeral = ten(digitInTens)
    val singleDigitInRomanNumeral = singleDigit(lastDigit)
    return thousandInRomanNumeral + hundredInRomanNumeral + tensInRomanNumeral + singleDigitInRomanNumeral

}

fun ten(digitInTens: Int): String {
    return if (digitInTens < 4) {
        (1..digitInTens).fold("") { acc, _ -> acc + "X" }
    } else if (digitInTens == 4) {
        "XL"
    } else if (digitInTens < 9) {
        "L" + (1..(digitInTens - 5)).fold("") { acc, _ -> acc + "X" }
    } else {
        "XC"
    }
}

fun hundred(digitInHundred: Int): String {
    return if (digitInHundred < 4) {
        (1..digitInHundred).fold("") { acc, _ -> acc + "C" }
    } else if (digitInHundred == 4) {
        "CD"
    } else if (digitInHundred == 5) {
        "D"
    } else if (digitInHundred == 6) {
        "DC"
    } else if (digitInHundred < 9) {
        "D" + (1..(digitInHundred - 5)).fold("") { acc, _ -> acc + "C" }
    } else {
        "CM"
    }
}

private fun thousand(digitInThousand: Int): String =
    (1..digitInThousand).fold("") { acc, _ ->
        acc + "M"
    }

private fun singleDigit(lastDigit: Int): String =
    if (lastDigit < 4) {
        (1..lastDigit).fold("") { acc, _ -> acc + "I" }
    } else if (lastDigit == 4) {
        "IV"
    } else if (lastDigit == 5) {
        "V"
    } else if (lastDigit == 6) {
        "VI"
    } else if (lastDigit < 9) {
        "V" + (1..(lastDigit - 5)).fold("") { acc, _ -> acc + "I" }
    } else {
        "IX"
    }
