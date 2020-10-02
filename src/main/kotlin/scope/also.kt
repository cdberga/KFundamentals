package scope

fun main() {
    val jake = Person(name = "Jake", age = 30, about = "Android Developer")
            .also { writeCreationLog(it) }
}

fun writeCreationLog(it: Person) {
    println("A new \"${it.javaClass.simpleName}\" \"${it.name}\" was created: ${it.toString()}")
}
