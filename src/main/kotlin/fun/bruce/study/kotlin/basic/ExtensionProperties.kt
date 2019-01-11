package `fun`.bruce.study.kotlin.basic

var StringBuilder.lastChar: Char
    get() {
        return get(length - 1)
    }
    set(value: Char) {
        setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {
    var sb = StringBuilder("Kotlin")
    println(sb.lastChar)

    sb.lastChar = 'm'
    println(sb.lastChar)

}
