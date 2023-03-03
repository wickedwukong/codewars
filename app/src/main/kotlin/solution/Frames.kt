package solution

import solution.Frame.IncompletePins
import solution.Frame.LastFrameWithABonus
import solution.Frame.Spare
import solution.Frame.Strike

internal fun String.frames() = this
    .split(" ")
    .filter { it != "" }
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
