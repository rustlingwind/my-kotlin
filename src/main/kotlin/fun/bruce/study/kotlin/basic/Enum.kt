package `fun`.bruce.study.kotlin.basic

enum class Color1 {
    RED, GREEN, BLUE
}

enum class Color2(val r:Int, val g:Int, val b:Int) {
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args:Array<String>) {
    println(Color1.BLUE)
    println(Color1.BLUE.name)
    println(Color1.BLUE.ordinal)

    println()

    println(Color2.BLUE.rgb())
    println(Color2.RED.rgb())
    println(Color2.GREEN.rgb())
}
