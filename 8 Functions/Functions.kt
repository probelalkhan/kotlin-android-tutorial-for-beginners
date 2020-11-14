fun rollDice(
        times: Int = 1,
        range: IntRange = (1..6)
) {
    for (i in 0 until times) {
        val result = range.random()
        println(result)
    }
}

fun getSum(vararg nums: Int) = nums.sum()

fun makeBurger(
        size: String,
        extraCheese: Boolean,
        makeItAMeal: Boolean,
        type: String
){
    println("Size: $size")
    println("Extra Cheese: $extraCheese")
    println("Make it a Meal: $makeItAMeal")
    println("type: $type")
}

fun main() {
//    rollDice()
//    getSum(5, 5, 10, 20)
//    makeBurger(
//            type = "Chicken",
//            size = "XL",
//            makeItAMeal = true,
//            extraCheese = true
//    )

    val sum = getSum(5, 5, 5)
    println(sum)
}