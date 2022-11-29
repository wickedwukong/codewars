package solution

import junit.framework.TestCase.assertEquals
import org.junit.Test

class StopgninnipSMysdroWTest {
    @Test
    fun stopgninnipSMysdroWNoWords() {
        assertEquals("", sentenceReverser(""))
    }

    @Test
    fun stopgninnipSMysdroWShortWords() {
        assertEquals("a bb ccc dddd", sentenceReverser("a bb ccc dddd"))
    }
    @Test
    fun stopgninnipSMysdroWLongWord() {
        assertEquals("edcba abc", sentenceReverser("abcde abc"))
    }
}
