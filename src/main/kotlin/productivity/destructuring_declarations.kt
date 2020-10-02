package productivity

fun main() {
    val (x,y,z) = arrayOf(5,10,15)
    val map = mapOf("Alice" to 21, "Bob" to 25)
    for((name, age) in map){
        println("$name is $age years old.")
    }

    val (min, max) = findMinMax(listOf(100,90,50,98,76,83))
    println()
    println("List: ${listOf(100,90,50,98,76,83)}")
    println("Min = $min, Max = $max")
}

fun findMinMax(list: List<Int>): Array<Int?> {

    val min = list.minOrNull()
    val max = list.maxOrNull()

    return arrayOf(min,max)
}
