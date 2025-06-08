package DAY4

fun firstCoffeeSorted(names: List<String>) = names.sorted().firstOrNull() ?: "None"
fun main() {
    println("First Sorted Coffee: ${firstCoffeeSorted(listOf("Espresso", "Cappuccino", "Latte"))}")
}