class Box(val width: Int, val length: Int, val height: Int) {

    inner class Content(val content: String){

        fun printBoxInfo(){
            println("$width, $length, $height")
        }

        fun printContent(){
            println(content)
        }

    }

}

fun main() {
    val box = Box(10,10,10)
    val content = box.Content("Some Content")
    content.printContent()
    content.printBoxInfo()
}