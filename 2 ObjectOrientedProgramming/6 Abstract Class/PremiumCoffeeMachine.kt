class PremiumCoffeeMachine(
        price: Double, color: String
) : BaseCoffeeMachine(price, color) {

    override val brand: String
        get() = "Brand X"

    override fun makeCoffee(type: String): String {
        return "Your $type is Ready ☕️"
    }
}