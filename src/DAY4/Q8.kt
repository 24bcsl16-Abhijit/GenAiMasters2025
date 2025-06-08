package DAY4

data class Barista(val favoriteCoffee: String?) {
    fun printFavorite() = println("Favorite coffee: ${favoriteCoffee ?: "Unknown"}")
}
fun main() {
    Barista(null).printFavorite()
}