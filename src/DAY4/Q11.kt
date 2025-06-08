package DAY4

val pricesMap = mapOf("Small" to 100.0, "Medium" to 150.0, "Large" to 200.0)
fun getCoffeePrice(size: String?) = size?.let { pricesMap[it] }
fun main() {
    println("Coffee Price: ${getCoffeePrice("Medium")}")
}