/*Type Alias */

typealias Number<T> = (T) -> Boolean

fun main() {
    val x: Number<Int> = { it > 0 }
    println("Positive numbers in the list are: "
            +listOf(11, -1, 10, -25, 55 , 43, -7).filter(x))

}