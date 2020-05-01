/*
*   Sealed Class
*   Define a restricted hierarchy means So check weather a object certain type or not
*   Abstract by default
*   Useful in when expression
* */

fun main(args: Array<String>){
    val someItem = getPlant()
     println(someItem)
    when(someItem){
        is Fruit -> println("Some Fruit")
        is Vegetable -> println("Some Vegetables")
    }
}

abstract class Plant

sealed class Fruit: Plant()

class Apple: Fruit()

sealed class Vegetable: Plant()

class Potato: Vegetable()

fun getPlant() : Plant = Apple()