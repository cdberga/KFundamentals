package collections

data class Configuration(val host: String, val port: String)

fun main() {
    val configuration = Configuration("127.0.0.1", "9092")
    runSample(configuration)
}

fun runSample(configuration: Configuration) {
    with(configuration){
        println("Sample1 = $host:$port")
    }
    println("Sample2 = ${configuration.host}:${configuration.port}")
}
