package `fun`.bruce.study.kotlin.basic

import kotlin.Exception

enum class Color(val r:Int, val g:Int, val b:Int) {
    RED(255, 0, 0),
    ORANGE(255,165,0),
    YELLOW(255,255,0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75,0,130),
    VIOLET(238,130,238);

    /**
     * a simple function
     */
    fun rgb() = (r * 256 + g) * 256 + b

    /**
     * a function using the when expression with enum parameters
     */
    fun getWarmth() = when(this) {
        RED, ORANGE, YELLOW -> "warm"
        GREEN -> "neutral"
        BLUE, INDIGO, VIOLET -> "cold"
    }

    /**
     * a function using the when expression with arbitrary type of parameters
     */
    fun mix(c: Color) = when (setOf(this, c)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

    /**
     * a function using the when expression with no parameters
     */
    fun mixOptimized(c: Color) = when {
        (this == RED && c == YELLOW) || (this == YELLOW && c == RED) -> ORANGE
        (this == YELLOW && c == BLUE || this == BLUE && c == YELLOW) -> GREEN
        this == BLUE && c == VIOLET || this == VIOLET && c == BLUE -> INDIGO
        else -> throw Exception("Dirty color")
    }

}
