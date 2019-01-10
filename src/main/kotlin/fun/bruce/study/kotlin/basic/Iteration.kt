package `fun`.bruce.study.kotlin.basic

import java.util.*

val binaryRepos = TreeMap<Char,String>()

fun main(args:Array<String>) {
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())  // convert from decimal to binary
        binaryRepos[c] = binary
    }

    for ((letter, binary) in binaryRepos) {
        println("$letter = $binary")
    }
}
