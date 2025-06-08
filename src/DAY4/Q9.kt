package DAY4

fun filterCoffeeTypes(coffees: List<String>) = coffees.filter { it.startsWith("C") }

fun main() {
    println("Filtered Coffees: ${filterCoffeeTypes(listOf("Espresso", "Cappuccino", "Latte"))}")
}