package `fun`.bruce.study.kotlin.basic

fun main(args:Array<String>) {

    // iterate collections
    for (i in 1..10) {
        print(i)
    }
    println()

    for (ch in 'A'..'Z') {
        print(ch)
    }
    println()

    // contains in a sequence or collection (list/map/etc.)
    val ch = 'A'
    when(ch) {
        in 'A'..'Z' -> println("belongs to A..Z")
        in 'a'..'z' -> println("belongs to a..z")
        else -> println(ch)
    }

    val arr = listOf("Bruce","Alice")
    if ("Bruce" in arr) {
        println("Bruce in list")
    }else {
        println("Bruce not in list")
    }

    val map = mapOf("Bruce" to 38, "Alice" to 28)
    if ("Bruce" in map)
        println("Bruce in map")
    else
        println("Bruce not in map")
}
