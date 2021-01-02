open class BaseCoffeeMachine(
        private val price: Double,
        private val color: String
) {

    fun makeCoffee(){
        println("Here is your coffee ☕️")
    }
}