package DAY3

fun main() {
    val temperature = 65
    println(when (temperature) {
        in 0..50 -> "Too Cold!"
        in 51..70 -> "Perfect!"
        else -> "Too Hot!"
    })
}