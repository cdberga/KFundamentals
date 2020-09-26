package functional

// #### Functions as parameters #####
fun calculate(x:Int,y:Int,operation:(Int,Int) -> Int) : Int{
    return operation(x,y)
}

fun sum(x: Int, y: Int) = x+y

private fun funcAsParameters() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }

    println("sumResult $sumResult, mulResult $mulResult")
}

// ##### Returning functions #####

fun operation():(Int) -> Int{
    return ::square
}

fun square(x:Int) = x*x

fun returningFunctions() {
    val func = operation()
    println(func(2))
}
// #########

fun main() {
//    funcAsParameters()
    returningFunctions()
}
