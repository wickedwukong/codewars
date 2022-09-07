/*
 * Equal Sides Of An Array
 * 6 kyu
 * https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/kotlin
 */
package solution

object EqualSidesOfAnArray {
    fun findEvenIndex(arr: IntArray): Int {
        return arr.indices.find { index ->
            val left = arr.slice(0 until  index).sum()
            val right = arr.slice(index + 1 until  arr.size ).sum()

            left == right
        } ?: -1
    }
}
