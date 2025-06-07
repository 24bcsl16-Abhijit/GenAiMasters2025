package DAY3

fun main() {
    val randomTip = (1..4).random()
    println(when (randomTip) {
        1 -> "Tip: Stirring counterclockwise makes coffee taste mystical."
        2 -> "Tip: Always take the last sip – it’s where the magic is!"
        3 -> "Tip: Order at odd hours for a surprise brew!"
        4 -> "Tip: Smile at the barista – coffee tastes better that way."
        else -> "Tip: Stay caffeinated!"
    })
}