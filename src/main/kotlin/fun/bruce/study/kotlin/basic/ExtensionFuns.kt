package `fun`.bruce.study.kotlin.basic

fun String.lastChar():Char {
    return this.get(this.length - 1)
}

fun String.firstChar():Char = get(0)

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
    println("Kotlin".firstChar())
}