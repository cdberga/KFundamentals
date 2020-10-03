fun main() {
//    dynamicInstruction()
//    jsFunction()
    externalSample()
}

private fun dynamicInstruction() {
    val a: dynamic = "abc"
    val b: String = a
    fun firstChar(s: String) = s[0]

    println("${firstChar(a)} == ${firstChar(b)}")
    println("${a.charCodeAt(0, "dummy argument")} == ${b[0].toInt()}")
    println(a.charAt(1).repeat(3))

    fun plus(v: dynamic) = v + 2

    println("2 + 2 = ${plus(2)}")
    println("'2' + 2 = ${plus("2")}")
}

fun jsFunction() {
    js("alert(\"Alert from Kotlin!\")")

    val json = js("{}")
    json.name = "Jane"
    json.hobby = "movies"
    println(JSON.stringify(json))
}