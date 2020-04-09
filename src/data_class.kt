
/*
*   Data Class
*   Primary constructor has at least one parameter
*   Can have a body but not required
*   DataClass automatically generated class methods
*    .equals() or == -> Compare data not a object reference
*    .toString() -> Prints out variable name and data
*    .copy() -> Creates a copy with only some data changed
* */
fun main(args: Array<String>) {

    val user = User("xyz","xyz@gmail.com", "123")
    val user1 = User("xyz","xyz@gmail.com", "123")
    val user2 = User("xyz","xyz@gmail.com", "123")
    println(user)
    println(user == user1) // return true

    // copy method
    val user3 = user2.copy(email = "xyz1@gmail.com");
    println(user3) // User(name=xyz, email=xyz1@gmail.com, password=123)

    val regClass = RegClass("xyz","xyz@gmail.com", "123")
    val regClass1 = RegClass("xyz","xyz@gmail.com", "123")

    println(regClass == regClass1) // return false bcz we are compare object references there is not a same object
    println(regClass.name == regClass1.name) // return true
}

data class User(var name: String, val email: String, val password: String)

class RegClass(var name: String, val email: String, val password: String)