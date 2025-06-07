package DAY3

fun main() {
    for (order in 1..10) {
        if (order == 5) {
            println("Rush hour!")
            break
        }
        println("Processing order #$order")
    }
}