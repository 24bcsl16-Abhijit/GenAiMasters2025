package DAY3

fun main() {
    for (order in 1..10) {
        if (order == 3 || order == 7) continue
        println("Preparing coffee order #$order (No decaf!)")
       }
}