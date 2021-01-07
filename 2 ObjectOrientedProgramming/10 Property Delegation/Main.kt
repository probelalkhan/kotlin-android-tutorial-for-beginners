import kotlin.reflect.KProperty

class Student {
    var firstName: String? by NameDelegate()
    var lastName: String? by NameDelegate()

    override fun toString(): String {
        return "$firstName $lastName"
    }
}

class NameDelegate {
    var formattedValue: String? = null

    operator fun setValue(
            thisRef: Any?,
            property: KProperty<*>,
            value: String?
    ) {
        if (value != null && value.length > 5) {
            formattedValue = value.trim().toUpperCase()
        }
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String? {
        return formattedValue
    }
}

fun main() {
    val student = Student()
    student.firstName = "be"
    student.lastName = " "
    println(student)
}