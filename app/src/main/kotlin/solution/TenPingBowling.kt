package solution

import solution.Frame.IncompletePins
import solution.Frame.LastFrameWithABonus
import solution.Frame.Spare
import solution.Frame.Strike

/*
 * Ten-Pin Bowling
 * 4 kyu
 * https://www.codewars.com/kata/5531abe4855bcc8d1f00004c/train/java
 */
class TenPingBowling {
    fun score(rawFrameInput: String): Int =
        rawFrameInput
            .frames()
            .mapIndexed { index, frame ->
                fun nextRoll() = rawFrameInput.frames().getOrNull(index + 1)?.firstRollScore ?: 0
                fun nextNextRoll() = rawFrameInput.frames().getOrNull(index + 1)?.secondRollScore
                    ?: rawFrameInput.frames().getOrNull(index + 2)?.firstRollScore ?: 0

                when (frame) {
                    is Strike -> frame.score + nextRoll() + nextNextRoll()
                    is Spare -> frame.score + nextRoll()
                    else -> frame.score
                }
            }.sum()
}

private fun String.frames() = this
    .split(" ")
    .map { frame ->
        when {
            frame == "X" -> Strike
            frame.endsWith("/") -> Spare(frame.first().digitToInt())
            frame.toCharArray().size == 3 -> {
                LastFrameWithABonus(frame.toCharArray().mapIndexed { index, it ->
                    if (it == 'X') 10 else if (it == '/') 10 - frame[index - 1].digitToInt() else it.digitToInt()
                })
            }

            else -> IncompletePins(frame.first().digitToInt(), frame.last().digitToInt())
        }
    }
