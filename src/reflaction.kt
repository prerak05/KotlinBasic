/*Reflection*/

class ReflectionDemo {
}

fun main()
{
    // Reference obtained using class name
    val abc = ReflectionDemo::class
    println("This is a class reference $abc")

    // Reference obtained using object
    val obj = ReflectionDemo()
    println("This is a bounded class reference ${obj::class}")
}