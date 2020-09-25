object DoAuth {
    fun takeParams(username:String, password:String){
        println("input Auth parameters = $username@$password")
    }
}

fun main() {
    DoAuth.takeParams("user", "pass")
}