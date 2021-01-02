abstract class BaseCoffeeMachine(
        private val price: Double,
        private val color: String
) {
    abstract val brand: String

    abstract fun makeCoffee(type: String): String

    open fun machineInfo(): String {
        return "Coffee Machine Details:\n" +
                "Price: $price\n" +
                "Color: $color\n"
    }
}