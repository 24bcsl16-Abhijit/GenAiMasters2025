package DAY4

data class CoffeeMenu(val items: List<String>) {
    fun printMenu() = items.forEach { println(it) }
}
fun main() {
    CoffeeMenu(listOf("Espresso", "Latte", "Cappuccino")).printMenu()
}