package collections

fun main() {
    val numbers = listOf(1,-2,3,-4,5,-6)
    val first = numbers.first()
    val last = numbers.last()

    val firstEven = numbers.first{ it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 == 1 }
    println("First $first, Last $last, First even $firstEven, Last Odd $lastOdd")
}