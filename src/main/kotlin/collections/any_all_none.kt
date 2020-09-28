package collections

fun main() {
    anyFunc()
    allFunc()
    noneFunc()
}

// ##### Any #####

fun anyFunc() {
    val numbers = listOf(1,-2,3,-4,5,-6)
    println(numbers)
    println("Any number less than zero? ${numbers.any{it <0}}")
    println("Any number greater than 6? ${numbers.any { it > 6}}")
}

// ##### All #####
fun allFunc(){
    val numbers = listOf(1,-2,3,-4,5,-6)
    println("All even? ${numbers.all { it % 2 == 0 }}")
    println("All less than 6? ${numbers.all { it < 6 }}")
}

// ##### None #####

fun noneFunc() {
    val numbers = listOf(1,-2,3,-4,5,-6)
    println("No number (not) even? ${numbers.none {it % 2 == 1}}")
    println("No number greater than 6? ${numbers.none{ it > 6}}")
}
