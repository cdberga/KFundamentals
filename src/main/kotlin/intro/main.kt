package intro

fun main(args: Array<String>) {
    println("Names: ")
    for (item : String in args){
        println("$item")
    }

    infix fun Int.m(other: Int) = this * other   // 4
    val myPair = 8 m 5
    println(myPair)

    var p: Print = Print()
    println(p.myFun(5, 10))
    println(p.myFun(8))
}
