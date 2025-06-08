package DAY4

fun highestPrice(prices: List<Double>) = prices.maxOrNull() ?: 0.0

fun main() {
    println("Highest Price: ${highestPrice(listOf(100.0, 200.0, 150.0))}")
}