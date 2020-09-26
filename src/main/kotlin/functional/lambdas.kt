package functional

val upperCase1 : (String) -> String = {str:String -> str.toUpperCase()}
val upperCase2 : (String) -> String = {str -> str.toUpperCase()}
val upperCase3 = {str: String -> str.toUpperCase()}
val upperCase5 : (String) -> String = {it.toUpperCase()}
val upperCase6 : (String) -> String = String::toUpperCase

fun main() {
    println(upperCase1("hello1"))
    println(upperCase2("hello2"))
    println(upperCase3("hello3"))
    println(upperCase5("hello5"))
    println(upperCase6("hello6"))
}
