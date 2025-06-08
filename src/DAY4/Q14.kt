package DAY4

fun discountPrices(prices: List<Double>) = prices.map { it * 0.9 }
fun main() {
    println("Discounted Prices: ${discountPrices(listOf(100.0, 200.0, 150.0))}")
}