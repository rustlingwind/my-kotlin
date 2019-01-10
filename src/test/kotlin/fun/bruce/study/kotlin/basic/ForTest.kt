package `fun`.bruce.study.kotlin.basic


fun main(args:Array<String>) {
    val nameList = ArrayList<String>()
    nameList.add("Bruce")
    nameList.add("Qianqian")
    nameList.add("Hanli")
    nameList.add("Jintong")

    println("----while----")
    iterateByWhile(nameList)

    println("----for----")
    iterateByFor(nameList)

    println("----for in reverse order----")
    iterateInReverseOrderByFor(nameList)
}
