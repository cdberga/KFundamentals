package collections

fun main() {
    val numbers = listOf(1,-2,3,-4,5,-6)
    val count = numbers.count()
    val countEven = numbers.count { it % 2 == 0 }
    println("Count $count, count even $countEven")
}