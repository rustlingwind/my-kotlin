package `fun`.bruce.study.kotlin.basic

class Person (val name: String, var isMarried: Boolean)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }

    val isNotSquare: Boolean get() = height != width

}