
class PremiumCoffeeMachine(
        private val price: Double,
        private val color: String
) : BaseCoffeeMachine(price, color) {


    fun makeCappuccino(){
        println("Here is your cappuccino ☕️")
    }
}