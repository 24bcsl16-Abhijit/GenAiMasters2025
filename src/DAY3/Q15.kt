package DAY3

fun main() {
    var inventory = 10
    do {
        println("Stock update: $inventory cups left.")
        inventory--
    } while (inventory > 0)
}