package DAY4

fun isValidCoffeeType(type: String?) = type != null && type in listOf("Espresso", "Latte", "Cappuccino")
fun main() {
    println("Valid Coffee: ${isValidCoffeeType("Latte")}")
}