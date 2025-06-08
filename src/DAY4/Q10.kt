package DAY4

class CoffeeCup(val temperature: Int) {
    fun isTooHot() = temperature > 70
}
fun main() {
    println("Coffee too hot? ${CoffeeCup(75).isTooHot()}")
}