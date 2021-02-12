/* *
+------+--------------+---------------------+
|      |  Immutable   |       Mutable       |
+------+--------------+---------------------+
| List | listOf<T>()  | mutableListOf<T>()  |
| Set  | setOf<T>()   | mutableSetOf<T>()  |
| Map  | mapOf<K,V>() | mutableMapOf<K,V>() |
+------+--------------+---------------------+
* */

fun main() {
    val students = mutableMapOf<Int, String>(1 to "Belal", 2 to "Ramiz", 3 to "Sunny")
    students.remove(1)
    students[7] = "new value"
    students.forEach { t, u ->
        println("$t and $u")
    }
}