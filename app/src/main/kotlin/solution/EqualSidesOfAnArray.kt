/*
 * Equal Sides Of An Array
 * 6 kyu
 * https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/kotlin
 */
package solution

object EqualSidesOfAnArray {
    fun findEvenIndex(arr: IntArray): Int {
        val intList = arr.toList()
        return intList.indices.find { index ->
            val left = intList.subList(0, index).sum()
            val right = intList.subList(index + 1, intList.size).sum()

            left == right
        } ?: -1
    }
}
