package DAY4

fun calculateTotalPrice(quantity: Int, pricePerCup: Double?) = quantity * (pricePerCup ?: 0.0)

fun main () {
    println(calculateTotalPrice(3, 150.0))
}