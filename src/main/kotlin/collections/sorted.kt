package collections

fun main() {
    val shuffled = listOf(5,4,2,1,3)
    val natural = shuffled.sorted()
    val inverted = shuffled.sortedBy { -it }

    println(shuffled)
    println(natural)
    println(inverted)
}