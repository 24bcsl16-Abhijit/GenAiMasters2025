package DAY3

fun main() {
    var smallCup = "Small"
    var largeCup = "Large"
    val temp = smallCup
    smallCup = largeCup
    largeCup = temp
    println("Small: $smallCup, Large: $largeCup")
}