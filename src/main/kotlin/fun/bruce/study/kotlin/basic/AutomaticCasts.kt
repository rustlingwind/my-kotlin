package `fun`.bruce.study.kotlin.basic

/**
 * This module defines an expression interface and two classes that implemented this interface:
 * Num and Sum
 *
 * The classes could be used to compute the expression values like:
 * (1 + 2) + 3
 *
 * The data model is a tree, each node is an expression, either Num (leaf) or Sum (not leaf)
 *
 * @author Wang Liang
 */

interface Expr
class Num(val value:Int) : Expr
class Sum(val left:Expr, val right:Expr) : Expr

fun eval1(e: Expr): Int {
    if (e is Num) {
        // e is automatically cast to `Num` in this branch
        // no need to cast it explicitly
//      val n = e as Num
//      return n.value
        return e.value
    }else if (e is Sum) {
        // e is automatically cast to `Sum` in this branch
        return eval1(e.left) + eval1(e.right)
    }else {
        throw IllegalArgumentException("Unknown expression")
    }
}

fun eval2(e:Expr): Int {
    when(e) {
        is Num -> {
            return e.value
        }
        is Sum -> {
            return eval2(e.left) + eval2(e.right)
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }
}

fun eval3(e:Expr): Int {
    return when(e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = eval3(e.left)
            val right = eval3(e.right)
            println("sum: $left + $right")
            left + right
        }
        else -> {
            throw IllegalArgumentException("Unknown expression")
        }
    }
}
