package solution

import org.junit.Test
import kotlin.test.assertEquals

class SpoonerizeMeTest {
    @Test
    fun spoonerizeSingleLetterWords() {
        assertEquals(spoonerizeMe("a b"), "b a")
    }
}
