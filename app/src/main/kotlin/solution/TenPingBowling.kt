package solution

import solution.Frame.IncompletePins
import solution.Frame.TwoRollFrameWithABonus
import solution.Frame.Spare
import solution.Frame.Strike

/*
 * Ten-Pin Bowling
 * 4 kyu
 * https://www.codewars.com/kata/5531abe4855bcc8d1f00004c/train/java
 */
class TenPingBowling {
    fun score(frameString: String): Int {
        val frames =
            frameString
                .split(" ")
                .map { frame ->
                    when {
                        frame == "X" -> Strike
                        frame.endsWith("/") -> Spare(frame.first().digitToInt())
                        frame.toCharArray().size == 3 -> {
                            TwoRollFrameWithABonus(frame.toCharArray().mapIndexed { index, it ->
                                if (it == 'X') 10 else if (it == '/') 10 - frame[index - 1].digitToInt() else it.digitToInt()
                            })
                        }
                        else -> IncompletePins(frame.first().digitToInt(), frame.last().digitToInt())
                    }
                }

        return frames.mapIndexed { index, frame ->
            fun nextRoll() = frames.getOrNull(index + 1)?.firstRoll ?: 0
            fun nextNextRoll() = frames.getOrNull(index + 1)?.secondRoll ?: frames.getOrNull(index + 2)?.firstRoll ?: 0

            when (frame) {
                is Strike -> frame.score + nextRoll() + nextNextRoll()
                is Spare -> frame.score + nextRoll()
                is TwoRollFrameWithABonus -> frame.score
                else -> frame.score
            }
        }.sum()
    }
}
