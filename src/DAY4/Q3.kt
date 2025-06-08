package DAY4

data class CoffeeOrder(val type: String, val size: String) {
    fun printSummary() = println("Order: $size $type")
}
fun main() {
    CoffeeOrder("Espresso", "Large").printSummary()
}