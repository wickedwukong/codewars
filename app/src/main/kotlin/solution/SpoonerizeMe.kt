package solution

import kotlin.coroutines.coroutineContext

/*
 * Spoonerize Me
 * 7 kyu
 * https://www.codewars.com/kata/56b8903933dbe5831e000c76
 */

fun spoonerizeMe(words: String): String {
    val splitWords = words.split(" ") //["pot", "nicking"]
    val firstWord = splitWords.first() //"pot"
    val secondWord = splitWords.last()  //"nicking"

    val firstWordLetters: List<Char> = firstWord.toCharArray().toList() //[p,o,t]

    val secondWordLetters: List<Char> = secondWord.toCharArray().toList() //[n,i,c,k,i,n,g]

    val firstLetterInFirstWord: Char = firstWordLetters.first() //p

    val firstLetterInSecondWord: Char = secondWordLetters.first() //n


    val swapped1stWord= firstWordLetters.drop(1).reversed().plus(firstLetterInSecondWord).reversed().joinToString("")
    //[p,o,t] -> [o,t] -> [t,o] -> [t,o,n] -> [n,o,t] -> not

    val swapped2ndWord = secondWordLetters.drop(1).reversed().plus(firstLetterInFirstWord).reversed().joinToString("")
    //[n,i,c,k,i,n,g] -> [i,c,k,i,n,g] -> [g,n,i,k,c,i] -> [g,n,i,k,c,i,p] -> [p,i,c,k,i,n,g] -> picking


    return "$swapped1stWord $swapped2ndWord" //not picking
}

fun main() {
    val ned = "ned"
    val xuemin = "xuemin"

    val nedChars = ned.toCharArray().toMutableList() //[n,e,d]
    val xueminChars = xuemin.toCharArray().toMutableList() //[x,u,e,m,i,n]


    nedChars[0] = 'x'

    println(nedChars) //[x,e,d]

    println(xueminChars) //[x,u,e,m,i,n]






}
