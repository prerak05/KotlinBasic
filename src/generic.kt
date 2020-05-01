/*
*  Generic class
*
* */

fun main(argus: Array<String>) {
    val info = Info<String>()
    info.getLength("Some String")

    val info1 = Info<Int>()
    info1.getLength(1356)

    val info2 = Info<ArrayList<Int>>()
    info2.getLength(arrayListOf(1, 2, 3, 5, 8, 9))
}

class Info<T> {
    fun getLength(item: T) {
        println(item.toString().length)
    }
}