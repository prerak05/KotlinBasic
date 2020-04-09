/*
*   Enum class
*   Enum constant have a properties like name & ordinal(position)
* */

fun main(argus: Array<String>) {
    var color = Color.RED
    when(color){
        Color.RED -> println("You choose red")
        Color.BLUE -> println("You choose blue")
        Color.GREEN -> println("You choose green")
    }
    println(Color.RED.name)
    println(Color.BLUE.ordinal)
}

enum class Color {
    RED,
    GREEN,
    BLUE
}