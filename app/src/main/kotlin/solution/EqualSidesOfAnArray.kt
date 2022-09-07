/*
 * Equal Sides Of An Array
 * 6 kyu
 * https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/kotlin
 */
package solution

object EqualSidesOfAnArray {
    fun findEvenIndex(arr: IntArray): Int {
        val intList = arr.toList()
        var result = -1
        for (i in intList.indices) {
            val left = intList.subList(0, i).sum()
            val right = intList.subList(i + 1, intList.size).sum()

            if (left == right) {
                result = i
                break
            }
        }
        return result
    }
}
