package solution

import org.junit.Test
import kotlin.test.assertEquals

internal class ComplementaryDNATest {

    @Test
    fun basicTests() {
        assertEquals("TAACG", makeComplement("ATTGC"))
        assertEquals("CATA", makeComplement("GTAT"))
    }

    @Test
    fun emptyDNATests() {
        assertEquals("", makeComplement(""))
    }
}
