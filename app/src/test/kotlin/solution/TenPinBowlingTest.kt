package solution

import org.junit.Test
import kotlin.test.assertEquals

class TenPinBowlingTest {
    @Test
    fun `codewars test`() {
        assertEquals(20, tenPinBowlingScore("11 11 11 11 11 11 11 11 11 11"))
        assertEquals(300, tenPinBowlingScore("X X X X X X X X X XXX"))
    }

    @Test
    fun `basic strike`() {
        assertEquals(10, tenPinBowlingScore("X"))
        assertEquals(28, tenPinBowlingScore("X 54"))
        assertEquals(30, tenPinBowlingScore("X X"))
    }
    @Test
    fun `frame of incomplete pins`() {
        assertEquals(26, tenPinBowlingScore("54 72 44"))
    }
    @Test
    fun `basic spare`() {
        assertEquals(24, tenPinBowlingScore("9/ 54"))
        assertEquals(150, tenPinBowlingScore("5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5"))
    }
}
