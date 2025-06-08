package DAY4

data class CoffeeBean(val name: String, val roastLevel: String)
fun main() {
    val coffeeBeans = listOf(
        CoffeeBean("Arabica", "Medium"),
        CoffeeBean("Robusta", "Dark")
    )
}