fun main() {
//    stateCall()
    colorCall()
}
// ##### State #####

private fun stateCall() {
    val state = State.RUNNING
    val message = when (state) {
        State.IDLE -> "It's Idle"
        State.RUNNING -> "It's Running"
        State.FINISHED -> "It's Finished"
    }
    println(message)
}

enum class State{
    IDLE, RUNNING, FINISHED
}

// ##### Color #####

fun colorCall(){
    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
}

enum class Color(val rgb:Int){
    RED(0XFF0000),
    GREEN(0X00FF00),
    BLUE(0X0000FF),
    YELLOW(0XFFFF00);

    fun containsRed() = (this.rgb and 0XFF0000 != 0)
}