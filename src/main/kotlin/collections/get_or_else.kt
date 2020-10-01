package collections

fun main() {
//    getOrElseSample1()
    getOrElseSample2()
}

private fun getOrElseSample1() {
    val list = listOf(0, 10, 20)
    println(list.getOrElse(1) { 42 })
    println(list.getOrElse(10) { 42 })
}

private fun getOrElseSample2(){
    val map = mutableMapOf<String, Int?>()
    println(map.getOrElse("x") {1})

    map["x"] = 3
    println(map.getOrElse("x") {1})

    map["x"] = null
    println(map.getOrElse("x") {1})
}