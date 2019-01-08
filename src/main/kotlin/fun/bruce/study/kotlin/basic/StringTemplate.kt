/**
 * This module is used to show the basic usage of string template in Kotlin
 *
 * @author Wang Liang
 * @since 8th/Jan/2019
 */
fun printName1(args: Array<String>) {
    val name = getName(args)
    println("Hello $name ! (1st)")
}

fun printName2(args: Array<String>) {
    println("Hello ${getName(args)} ! (2nd)")
}

fun printName3(args: Array<String>) {
    println("Hello ${if (args.isNotEmpty()) args[0] else "Kotlin"} ! (3rd)")
}

fun getName(args:Array<String>): String {
    return if (args.isNotEmpty()) args[0] else "Kotlin"
}
