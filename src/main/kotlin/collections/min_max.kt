package collections

fun main() {
    val numbers = listOf(1,2,3)
    val emptyList = emptyList<Int>()

    println("Numbers: $numbers, min: ${numbers.minOrNull()}, max: ${numbers.maxOrNull()}")
    println("Empty list: ${emptyList}, min: ${emptyList.minOrNull()}, max: ${emptyList.maxOrNull()}")
}