package solution

sealed interface Frame {
    val score: Int
    val firstRoll: Int
    val secondRoll: Int?

    data class Spare(override val firstRoll: Int) : Frame {
        override val score: Int
            get() = 10
        override val secondRoll = 10 - firstRoll
    }
    data class TwoRollFrameWithABonus(val rolls: List<Int>) : Frame {
        override val score: Int
            get() = rolls.sum()
        override val firstRoll: Int
            get() = rolls.first()
        override val secondRoll: Int?
            get() = rolls.getOrNull(1)
    }

    data class IncompletePins(override val firstRoll: Int, override val secondRoll: Int) : Frame {

        override val score: Int
            get() = firstRoll + secondRoll
    }

    object Strike : Frame {
        override val score: Int
            get() = 10
        override val firstRoll: Int
            get() = 10
        override val secondRoll: Int?
            get() = null
    }
}
