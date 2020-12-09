class Box {

    /*
    * public: Default, can be accessed everywhere
    * internal: Available everywhere in the same module
    * private: Available only inside the containing file or class
    * protected: Same as private but available inside subclasses or child classes
    * */

    var length: Int = 10
    var width: Int = 20
    var height: Int = 5

    val volume
        get() = length * width * height

    var boxName: String = "Box Name"
    private set(value) {
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