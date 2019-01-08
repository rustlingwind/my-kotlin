package `fun`.bruce.study.kotlin.basic

fun main(args:Array<String>) {
    val person = Person("Bruce", true)
    println("isMarried:${person.isMarried}")

    println()

    val rectangle1 = Rectangle(height = 10, width = 10)
    println("height: ${rectangle1.height}, width: ${rectangle1.width}")
    println("isSquare: ${rectangle1.isSquare}, isNotSquare: ${rectangle1.isNotSquare}")

    val rectangle2 = Rectangle(height = 10, width = 5)
    println("height: ${rectangle2.height}, width: ${rectangle2.width}")
    println("isSquare: ${rectangle2.isSquare}, isNotSquare:${rectangle2.isNotSquare}")

}

