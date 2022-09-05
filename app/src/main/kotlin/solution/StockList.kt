/*
 * Help the bookseller !
 * https://www.codewars.com/kata/54dc6f5a224c26032800005c/kotlin
 */
package solution

object StockList {
    fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {
        if (lstOfArt.isEmpty()) {
            return ""
        }

        val totalBookFor = { category: String ->
            lstOfArt.filter { code -> code.startsWith(category) }
                .fold(0) { total, code -> total + code.split(" ").last().toInt() }
        }

        return lstOfCat.joinToString(" - ") { category ->
            "($category : ${totalBookFor(category)})"
        }
    }
}
