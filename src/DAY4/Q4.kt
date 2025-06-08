package DAY4

fun greetCustomer(name: String?) = "Hello, ${name ?: "Guest"}!"

fun main() {
    println(greetCustomer(null))
}