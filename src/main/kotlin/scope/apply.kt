package scope

data class Person(var age:Int = 0, var about:String = "", var name: String = "")

fun main() {
    val jake = Person()
    val stringDescription = jake.apply {
        name = "Jake"
        age = 30
        about = "Android Developer"
    }.toString()
    println(stringDescription)
}