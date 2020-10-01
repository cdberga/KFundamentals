package scope

fun main() {
    checkEmpty()
    printNonNull(null)
    printNonNull("My String")
}

private fun checkEmpty() {
    val empty = "test".let {
        println("CustomPrint: $it".toUpperCase())
        it.isEmpty()
    }
    println(" is empty: $empty")
}

fun printNonNull(str : String?){
    println("Printing: \"$str\":")

    str?.let {
        print("\t")
        println("customPrint: $it".toUpperCase())
        println()
    }
}