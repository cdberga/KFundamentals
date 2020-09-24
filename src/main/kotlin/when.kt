fun main() {
//    whenExpr()
    whenAssigns()
}

fun whenAssigns() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun whenExpr() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun whenAssign(obj: Any) : Any{
    val result = when (obj){
        1 -> "One"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

fun cases(o: Any) {

    when(o){
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

class MyClass