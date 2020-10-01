package collections

fun main() {
    val A = listOf("a", "b", "c")
    val B = listOf(1,2,3,4)

    val resultPairs = A zip B
    val resultReduce = A.zip(B) {a,b -> "$a$b"}

    println(A)
    println(B)
    println(resultPairs)
    println(resultReduce)
}