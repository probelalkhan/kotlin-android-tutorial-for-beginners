class Box {

    var length: Int = 10
    var width: Int = 20
    var height: Int = 5

    val volume
        get() = length * width * height

    var boxName: String = "Box Name"
    set(value) {
        if(value.length < 3){
            println("Name cannot be less than 3 characters")
        }else{
            field = value
        }
    }

    fun fillContents() {
        println("Box is Filled")
    }

    fun open() {
        println("Box Opened")
    }

}