package solution

sealed interface Frame {
    val score: Int
    val firstRollScore: Int
    val secondRollScore: Int?

    data class Spare(override val firstRollScore: Int) : Frame {
        override val score: Int
            get() = 10
        override val secondRollScore = 10 - firstRollScore
    }
    data class LastFrameWithABonus(val rolls: List<Int>) : Frame {
        init {
            check(rolls.size == 3)
        }
        override val score: Int
            get() = rolls.sum()
        override val firstRollScore: Int
            get() = rolls.first()
        override val secondRollScore: Int?
            get() = rolls.getOrNull(1)
    }

    data class IncompletePins(override val firstRollScore: Int, override val secondRollScore: Int) : Frame {

        override val score: Int
            get() = firstRollScore + secondRollScore
    }

    object Strike : Frame {
        override val score: Int
            get() = 10
        override val firstRollScore: Int
            get() = 10
        override val secondRollScore: Int?
            get() = null
    }
}
