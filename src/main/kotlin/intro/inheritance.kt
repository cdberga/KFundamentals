package intro// ##### Dogs #########

open class Dog {
    open fun sayHello(){
        println("wow wow!")
    }
}

class Yorkshire : Dog(){
    override fun sayHello() {
        println("wif wif!")
    }
}
// ###### Tigers ########
open class Tiger (val origin : String){
    fun sayHello(){
        println("A tiger from $origin says: grrrrh!")
    }
}

class SiberianTiger : Tiger("Siberia")

// ##### Lions #########
open class Lion(val name: String, val origin:String){
    fun sayHello(){
        println("$name tiger from $origin says: graoh!")
    }
}

class Asiatic (name:String) : Lion(name = name, "India")
// ##############

fun main() {
//    intro.dogs()

//    val tiger : intro.Tiger = intro.SiberianTiger()
//    tiger.sayHello()

    val lion : Lion = Asiatic("Rufo")
    lion.sayHello()
}

private fun dogs() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}