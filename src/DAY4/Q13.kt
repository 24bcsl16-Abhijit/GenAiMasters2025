package DAY4

fun countUniqueOrders(orders: Set<String>) = orders.size
fun main() {
    println("Unique Orders: ${countUniqueOrders(setOf("Latte", "Espresso", "Latte"))}")
}