package solution

import org.junit.Test
import kotlin.test.assertEquals

class TenPinBowlingTest {
    @Test
    fun `ten pin bowling`() {
        assertEquals(20, TenPingBowling().score("11 11 11 11 11 11 11 11 11 11"));
        assertEquals(300, TenPingBowling().score("X X X X X X X X X XXX"))
    }

    @Test
    fun `basic strike`() {
        assertEquals(10, TenPingBowling().score("X"));
        assertEquals(28, TenPingBowling().score("X 54"));
        assertEquals(30, TenPingBowling().score("X X"));
    }
    @Test
    fun `incomplete pins`() {
        assertEquals(26, TenPingBowling().score("54 72 44"));
    }
    @Test
    fun `basic spare`() {
        assertEquals(24, TenPingBowling().score("9/ 54"));
        assertEquals(150, TenPingBowling().score("5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5"));
    }
}
