package solution

import org.junit.Test
import kotlin.test.assertEquals

class SpoonerizeMeTest {
    @Test
    fun spoonerizeSingleLetterWords() {
        assertEquals("b a", spoonerizeMe("a b"))
        assertEquals("bc a", spoonerizeMe("ac b"), )
    }
}
