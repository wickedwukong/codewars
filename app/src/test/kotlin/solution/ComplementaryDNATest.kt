/*
 * Complementary DNA
 * https://www.codewars.com/kata/554e4a2f232cdd87d9000038/kotlin
 */
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
