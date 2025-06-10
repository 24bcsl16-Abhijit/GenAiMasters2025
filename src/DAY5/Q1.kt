package DAY5

fun operate(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun main() {
    val sum = operate(3, 4) { a, b -> a + b }
    println(sum)
}
