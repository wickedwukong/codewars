package solution

import org.junit.Test
import kotlin.test.assertEquals

class TenPinBowlingTest {
    @Test
    fun `ten pin bowling`() {
        assertEquals(20, TenPingBowling().score("11 11 11 11 11 11 11 11 11 11"));
        assertEquals(300, TenPingBowling().score("X X X X X X X X X XXX"))
    }
}
