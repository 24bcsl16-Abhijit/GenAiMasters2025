package DAY3

fun main() {
    val coffeePrice = 6
    println(when (coffeePrice) {
        in 1..3 -> "Budget coffee!"
        in 4..7 -> "Fairly priced coffee."
        else -> "Premium coffee experience!"
    })

}