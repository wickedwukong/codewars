package solution

import solution.Frame.Spare
import solution.Frame.Strike

/*
 * Ten-Pin Bowling
 * 4 kyu
 * https://www.codewars.com/kata/5531abe4855bcc8d1f00004c/train/java
 */

fun tenPinBowlingScore(rawFrameInput: String): Int {
    val frames = rawFrameInput.frames()

    return frames
        .mapIndexed { index, frame ->
            fun nextRollScore() = frames.getOrNull(index + 1)?.firstRollScore ?: 0
            fun nextNextRollScore() = frames.getOrNull(index + 1)?.secondRollScore
                ?: frames.getOrNull(index + 2)?.firstRollScore ?: 0

            when (frame) {
                is Strike -> frame.score + nextRollScore() + nextNextRollScore()
                is Spare -> frame.score + nextRollScore()
                else -> frame.score
            }
        }.sum()
}
