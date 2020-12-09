class Box(
        var length: Int = 0,
        var width: Int = 0,
        var height: Int = 0
) {

    init {
        println("Init Block Called")
    }

    constructor() : this(0,0,0){
        println("Secondary constructor called")
    }

    val volume
        get() = length * width * height

    fun fillContents() {
        println("Box is Filled")
    }

    fun open() {
        println("Box Opened")
    }
}