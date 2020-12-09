fun main(){
    val box1 = Box()
    val box2 = Box()
    val box3 = Box()

    box1.height = 7
    println("Height: ${box1.height}")
    println("Length: ${box1.length}")
    println("Width: ${box1.width}")
    println("Volume: ${box1.volume}")

    box1.boxName = "My"
    println("Name: ${box1.boxName}")

    box1.open()
    box1.fillContents()
}