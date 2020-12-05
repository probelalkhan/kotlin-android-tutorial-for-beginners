fun main(){
    val userType = ""

    when(userType){
        "admin" -> {
            println("Hey you are admin")
        }
        "editor" -> {
            println("Hey you are editor")
        }
        "author" -> {
            println("Hey you are author")
        }
        else -> {
            println("Hey you are subscriber")
        }
    }
}