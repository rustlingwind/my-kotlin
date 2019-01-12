package `fun`.bruce.study.kotlin.basic

fun <T> joinToString(
        collection: List<T>,
        separator: String = ",",
        prefix: String = "[",
        postfix: String = "]"
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

//fun toList<T>(vararg values: T) : Array<T> {
//    return listOf(values)
//}


fun main(args: Array<String>) {
    println(joinToString(listOf(1,2,3)))

//    println(toList(1,2,3))

}
