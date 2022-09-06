/*
 * Small enough? - Beginner
 * 7 kyu
 * https://www.codewars.com/kata/57cc981a58da9e302a000214/kotlin
 */

package solution

fun smallEnough(a: IntArray, limit: Int): Boolean = a.all { it <= limit }
