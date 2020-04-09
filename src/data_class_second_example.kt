/*
*  Data Class example 2
*
*  Create a data class that stores customer information such as a name, email and products bought.
*  Create  a 3 customers and add theme to a list.
*
*  One of the customers has changed their email. You want to keep the old customer information
*  but also add the new information to the list.
*
*  Create a function that sends an email to each customer(print a message to the customer)
* */

fun main(args: Array<String>) {
    val customers = arrayListOf<Customer>()
    customers.add(Customer("Alice", "alice@gmail.com", 7))
    customers.add(Customer("Bob", "bob@gmail.com", 2))
    customers.add(Customer("Salaman", "salaman@gmail.com", 5))

    println(customers)

    val newCustomer = customers[1].copy(email = "bobnew@gmail.com")
    customers.add(newCustomer)
    println(customers)

    sendEmail(customers)
}

fun sendEmail(customers: ArrayList<Customer>){
    customers.forEach { println("Sending email to ${it.email}") }
}
data class Customer(
    val name: String,
    val email: String,
    val productsBought: Int
)