fun main(){
    val coffeeMachine = PremiumCoffeeMachine(10000.0, "BROWN")
    val info = coffeeMachine.machineInfo()
    val coffee = coffeeMachine.makeCoffee("CAPPUCCINO")
    println(coffee)
    println(info)

    val simpleCoffeeMachine = CoffeeMachine(2000.0, "BROWN")
    val coffee1 = simpleCoffeeMachine.makeCoffee("CAPPUCCINO")
    println(coffee1)
}