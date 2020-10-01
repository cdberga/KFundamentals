package scope

fun main() {
    getNUllableLength(null)
    getNUllableLength("")
    getNUllableLength("some string with kotlin")
}

fun getNUllableLength(ns: String?) {
    println("for \"$ns\":")
    ns?.run {
        println("\tis empty? " + isEmpty())
        println("\tlength = $length")
        println(length)
    }
}
