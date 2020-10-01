package collections

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val evenOdd = numbers.partition { it % 2 == 0 }
    val (positives, negatives) = numbers.partition { it > 0 }

    println("Original numbers: $numbers")
    println("First partition => Even and Odd numbers: $evenOdd")
    println("Second partition => positives: $positives")
    println("Second partition => negatives: $negatives")
}

