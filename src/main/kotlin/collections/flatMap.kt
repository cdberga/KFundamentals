package collections

fun main() {
    val numbers = listOf(1,2,3)
    val tripled = numbers.flatMap { listOf(it,it*2,it*3) }

    println("First list: $numbers")
    println("Tripled: $tripled")
}