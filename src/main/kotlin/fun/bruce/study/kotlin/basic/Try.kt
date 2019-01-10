package `fun`.bruce.study.kotlin.basic

import java.lang.NumberFormatException


class Animal(val name: String) {
    fun grow() {
        println("I am a $name, I have grown up.")
    }

    // throws is not needed anymore in Kotlin
    fun fly() {
        when (name) {
            "Bird","Bat" -> println("I am a $name, I can fly.")
            "Human" -> println("I am a $name, I can fly with technology.")
            else -> throw IllegalArgumentException("I am not a Bird Nor a Bat Nor a Human, I cannot fly.")
        }
    }

    fun die() {
        println("I am an animal, I will die one day.")
    }
}

fun main(args:Array<String>) {
    // try..catch..finally
    var animal: Animal? = null
    try {
        animal = Animal("Bird")
        animal.grow()
        animal.fly()
        animal.die()

        println()

        animal = Animal("Dog")
        animal.grow()
        animal.fly()
        animal.die()
    }catch (e: IllegalArgumentException) {
        println(e.message)
    }finally {
        animal?.die()
    }

    // use try as an expression
    val num = try {
        Integer.parseInt("666s")
    }catch (e: NumberFormatException) {
        null
    }

    println("num: $num")  // will output "num: null"
}
