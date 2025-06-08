package DAY4

fun mostExpensiveCoffee(coffees: Map<String, Double>) = coffees.maxByOrNull { it.value }?.key ?: "None"
fun main() {
    println("Most Expensive Coffee: ${mostExpensiveCoffee(mapOf("Espresso" to 120.0, "Latte" to 150.0))}")
}