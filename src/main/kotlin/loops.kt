fun main() {
//    cakes1()
    eatAndBake()
}
// ##########
private fun cakes1() {
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
}

// ##########
fun eatACake() = println("Eat a cake")
fun bakeACake() = println("Bake a cake")
fun eatAndBake(){
    var cakesEaten = 0
    var cakesBaked = 0

    while(cakesEaten < 5){
        eatACake()
        cakesEaten ++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}