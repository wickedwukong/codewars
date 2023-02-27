package solution


import kotlin.test.assertEquals
import org.junit.Test

class TestEncode {
    @Test
    fun shouldWorkForThousands() {
        assertEquals("M", encode(1000))
        assertEquals("MM", encode(2000))
        assertEquals("MMM", encode(3000))
    }

    @Test
    fun shouldWorkForSingleDigit() {
        assertEquals("", encode(0))
        assertEquals("I", encode(1))
        assertEquals("II", encode(2))
        assertEquals("III", encode(3))
        assertEquals("IV", encode(4))
        assertEquals("V", encode(5))
        assertEquals("VI", encode(6))
        assertEquals("VII", encode(7))
        assertEquals("VIII", encode(8))
        assertEquals("IX", encode(9))
    }
    @Test
    fun shouldWorkForDoubleDigitUnder20() {
        assertEquals("X", encode(10))
        assertEquals("XI", encode(11))
        assertEquals("XII", encode(12))
        assertEquals("XIII", encode(13))
        assertEquals("XIV", encode(14))
        assertEquals("XV", encode(15))
        assertEquals("XVI", encode(16))
        assertEquals("XVII", encode(17))
        assertEquals("XVIII", encode(18))
        assertEquals("XIX", encode(19))
        assertEquals("XX", encode(20))
    }
    @Test
    fun shouldWorkForMultipleTens() {
        assertEquals("X", encode(10))
        assertEquals("XX", encode(20))
        assertEquals("XXX", encode(30))
        assertEquals("XL", encode(40))
        assertEquals("L", encode(50))
        assertEquals("LX", encode(60))
        assertEquals("LXX", encode(70))
        assertEquals("LXXX", encode(80))
        assertEquals("XC", encode(90))
    }
    @Test
    fun shouldWorkForMultipleHundred() {
        assertEquals("C", encode(100))
        assertEquals("CC", encode(200))
        assertEquals("CCC", encode(300))
        assertEquals("CD", encode(400))
        assertEquals("D", encode(500))
        assertEquals("DC", encode(600))
        assertEquals("DCC", encode(700))
        assertEquals("DCCC", encode(800))
        assertEquals("CM", encode(900))
    }
    @Test
    fun basic() {
        assertEquals("", encode(0))
        assertEquals("I", encode(1))
        assertEquals("XXI", encode(21))
        assertEquals("MMVIII", encode(2008))
        assertEquals("MDCLXVI", encode(1666))
    }
    @Test
    fun random() {
//        2735 expected:<MM[D]CCXXXV> but was:<MM[V]CCXXXV>
        assertEquals("MMDCCXXXV", encode(2735))
    }
}
