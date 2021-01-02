class CoffeeMachine (
        price: Double,
        color: String
) : BaseCoffeeMachine(price, color){

    override val brand: String
        get() = "Brand Y"

    override fun makeCoffee(type: String): String {
        Thread.sleep(4000)
        return "Your $type is Ready ☕️"
    }

}