package DAY5

fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6)
    val evens = nums.filter { it % 2 == 0 }
    println(evens)
}