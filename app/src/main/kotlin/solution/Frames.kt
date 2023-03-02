package solution

internal fun String.frames() = this
    .split(" ")
    .map { frame ->
        when {
            frame == "X" -> Frame.Strike
            frame.endsWith("/") -> Frame.Spare(frame.first().digitToInt())
            frame.toCharArray().size == 3 -> {
                Frame.LastFrameWithABonus(frame.toCharArray().mapIndexed { index, it ->
                    if (it == 'X') 10 else if (it == '/') 10 - frame[index - 1].digitToInt() else it.digitToInt()
                })
            }

            else -> Frame.IncompletePins(frame.first().digitToInt(), frame.last().digitToInt())
        }
    }
