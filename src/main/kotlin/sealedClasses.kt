sealed class Mammal(val name:String)

class Cat(val catName:String, val paws:Int) : Mammal(catName)
class Human(val humanName:String, val job:String) : Mammal(humanName)

fun greetMammal(mammal : Mammal):String{
    when(mammal){
        is Human -> return "Hello ${mammal.name}, you are working as ${mammal.job}."
        is Cat -> return "Hello ${mammal.name}, you have ${mammal.paws} paws."
    }
}

fun main() {
    println(greetMammal(Cat("Snowy", 4)))
    println(greetMammal(Human("Johnny", "Engineer")))
}