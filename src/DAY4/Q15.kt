package DAY4

class Customer(var loyaltyPoints: Int) {
    fun addPoints(points: Int) { loyaltyPoints += points }
}
fun main() {
    val customer = Customer(10)
    customer.addPoints(5)
    println("Loyalty Points: ${customer.loyaltyPoints}")
}