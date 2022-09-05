package solution

fun makeComplement(dna: String): String = dna.map<Any> { c ->
    when (c) {
        'A' -> "T"
        'T' -> "A"
        'G' -> "C"
        'C' -> "G"
        else -> ""
    }
}.joinToString("")
