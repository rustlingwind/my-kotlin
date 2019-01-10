package `fun`.bruce.study.kotlin.basic

fun main(args:Array<String>) {
    val num1:Expr = Num(1)
    val num2:Expr = Num(2)
    val num3:Expr = Num(3)

    val sum1:Expr = Sum(num1, num2)
    val sum2:Expr = Sum(sum1, num3)

    println(eval3(sum2))
}