class Square(
        private val width: Int,
        private val height: Int,
        private var color: String? = null,
        private var text: String? = null
) {
    fun fillColor(color: String) {
        this.color = color
        println("$color Color Filled")
    }

    fun addText(text: String) {
        this.text = text
        println("\"$text\" text added")
    }

    override fun toString(): String {
        return "Square(width=$width, height=$height, color=$color text=$text)"
    }
}

/*
Kotlin Scope Functions
+----------+----------------+----------------+
| Function | Context Object |  Return Value  |
+----------+----------------+----------------+
| let      | it             | lambda result  |
| run      | this           | lambda result  |
| with     | this           | lambda result  |
| apply    | this           | context object |
| also     | it             | context object |
+----------+----------------+----------------+
*/

lateinit var square: Square

fun main() {
    val square = Square(10, 20).also {
        it.fillColor("Black")
        it.addText("Black Text")
    }
    println(square)
}