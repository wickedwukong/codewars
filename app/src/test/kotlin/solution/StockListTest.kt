package solution

import org.junit.Test
import kotlin.test.assertEquals

class StockListTest {

    private fun testing(lstOfArt: Array<String>, lstOfCat: Array<String>, expect: String) {
        val actual: String = StockList.stockSummary(lstOfArt, lstOfCat)
        assertEquals(expect, actual)
    }

    @Test
    fun basicTests() {
        var b = arrayOf("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
        var c = arrayOf("A", "B", "C", "D")
        var res = "(A : 0) - (B : 1290) - (C : 515) - (D : 600)"
        testing(b, c, res)

        b = arrayOf("ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600")
        c = arrayOf("A", "B")
        res = "(A : 200) - (B : 1140)"
        testing(b, c, res)
    }

    @Test
    fun emptyStockListTests() {
        val b = arrayOf<String>()
        val c = arrayOf("A", "B", "C", "D")
        testing(b, c, "")
    }

    @Test
    fun emptyCategoryTests() {
        var b = arrayOf("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
        val c = arrayOf<String>()
        testing(b, c, "")
    }
}
