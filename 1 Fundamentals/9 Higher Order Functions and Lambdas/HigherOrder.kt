import kotlin.concurrent.thread

fun rollDice(
        range: IntRange,
        time: Int,
        callback: (result: Int) -> Unit
) {
    for (i in 0 until time) {
        val result = range.random()
        callback(result)
    }
}

fun rollDice(
        callback: ((result: Int) -> Unit)? = null
): String {

    thread {
        Thread.sleep(3000)
        callback?.invoke(4)
    }

    return "Dice Rolled"
}

fun main() {
    val result = rollDice{
        println(it)
    }

    println(result)
}