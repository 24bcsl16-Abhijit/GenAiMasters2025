package DAY4

class CoffeeShop(val name: String) {
    fun printOpeningHours() = println("$name is open from 8 AM to 6 PM.")
}
fun main() {
    CoffeeShop("Java Junction").printOpeningHours()
}