package solution

import solution.Frame.Spare
import solution.Frame.Strike

/*
 * Ten-Pin Bowling
 * 4 kyu
 * https://www.codewars.com/kata/5531abe4855bcc8d1f00004c/train/java
 */

fun tenPinBowlingScore(rawFrameInput: String): Int =
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
