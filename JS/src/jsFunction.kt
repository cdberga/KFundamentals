
fun jsFunction() {
    js("alert(\"Alert from Kotlin!\")")

    val json = js("{}")
    json.name = "Jane"
    json.hobby = "movies"
    println(JSON.stringify(json))
}