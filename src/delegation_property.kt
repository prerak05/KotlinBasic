/*Delegation Property */

import kotlin.reflect.KProperty

class Example {
    val someName by NameDelegate()
}
class NameDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return property.name
    }
}

fun main(args: Array<String>){
    val obj = Example()
    println(obj.someName)
}