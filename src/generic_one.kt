/*
*  Generic Class
* */

fun main(array: Array<String>){
    val printer = Printer<Set<String>>()
    printer.iterate(hashSetOf("Bob","xyz","abc"))

    val printer1 = Printer<List<String>>()
    printer1.iterate(listOf("Bob","xyz","abc"))

}

class Printer<T: Collection<String>>{
    fun iterate(collection: T){
        collection.forEach { println(it.toString()) }
    }
}