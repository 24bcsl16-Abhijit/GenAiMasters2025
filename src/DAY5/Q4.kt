package DAY5

fun main() {
    val names = listOf("Abhi", "Kotlin", "Dev")
    val uppercased = names.map { it.uppercase() }
    println("Map: $uppercased")
    names.forEach { println("Hello, $it") }
}