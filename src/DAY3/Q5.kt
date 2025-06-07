package DAY3

fun main() {
    val orderNumber = 7
    println(if (orderNumber % 2 == 0)
        "Your order number is even! Smooth coffee ahead."
    else
        "Your order is odd! Expect surprises!")
}