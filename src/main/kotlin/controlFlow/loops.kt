package controlFlow

fun main() {
//    controlFlow.cakes1()
//    controlFlow.eatAndBake()
    zoo()
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
// ##########
class Animal(val name:String)

class Zoo(val animals: List<Animal>){
    operator fun iterator() : Iterator<Animal> {
        return animals.iterator()
    }
}

fun zoo(){
    val zoo = Zoo(listOf(Animal("Zebra"), Animal("intro.Lion")))
    for (animal in zoo){
        println("Watch out, it's a ${animal.name}")
    }
}