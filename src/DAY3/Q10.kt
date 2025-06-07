package DAY3

fun main() {
    val caffeineLevel = 75
    println(when (caffeineLevel) {
        in 0..30 -> "Mild coffee for a gentle wake-up."
        in 31..70 -> "Medium strength for balance!"
        else -> "Strong coffee – brace yourself!"
    })
}