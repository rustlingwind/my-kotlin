package `fun`.bruce.study.kotlin.basic

fun iterateByWhile(arr:ArrayList<String>) {
    val iter:Iterator<String> = arr.iterator()
    while (iter.hasNext()) {
        val name = iter.next()
        println(name)
    }
}

/**
 * Kotlin's for loop statement is much like the statement of plsql
 */
fun iterateByFor(arr:ArrayList<String>) {
    for (i in 0..arr.size - 1)  // closed section
        println(arr[i])

    for (i in 0 until arr.size)  // half closed section
        println(arr[i])

    (0 until arr.size).forEach { i ->
        println(arr[i])
    }
}

fun iterateInReverseOrderByFor(arr:ArrayList<String>) {
    for (i in arr.size -1 downTo 0 step 2)
        println(arr[i])

    (arr.size -1 downTo 0 step 2).forEach { i ->
        println(arr[i])
    }
}
