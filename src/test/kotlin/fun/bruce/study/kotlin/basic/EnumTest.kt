package `fun`.bruce.study.kotlin.basic


fun main(args:Array<String>) {
    println("---- demonstrate enum objects:")

    println(Color.BLUE.name)
    println(Color.BLUE.ordinal)
    println(Color.BLUE)

    println("---- demonstrate calling the functions of an enum object:")

    println(Color.BLUE.rgb())
    println(Color.RED.rgb())
    println(Color.GREEN.rgb())

    println("---- demonstrate calling the functions of an enum object:")

    println(Color.RED.getWarmth())
    println(Color.GREEN.getWarmth())
    println(Color.BLUE.getWarmth())

    println("---- demonstrate arbitrary type of parameters for when expression:")
    println(Color.RED.mix(Color.YELLOW))

    println("---- demonstrate a when expression with no parameters:")
    println(Color.RED.mixOptimized(Color.YELLOW))
    println(Color.YELLOW.mixOptimized(Color.BLUE))
    println(Color.BLUE.mixOptimized(Color.VIOLET))

}