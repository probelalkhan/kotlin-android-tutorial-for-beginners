import kotlin.properties.Delegates

class StudentHeavy {
    init {
        println("Student Heavy Initialized")
    }
}

class Student {
    val heavy by lazy { StudentHeavy() }

    var marks: Int by Delegates.observable(50) { property, oldValue, newValue ->
        println("Old Value $oldValue")
        println("New Value $newValue")
    }

    var age: Int by Delegates.vetoable(14){ property, oldValue, newValue ->
        println("New Age $newValue")
        println("Old Age $oldValue")
        newValue >= 14
    }
}

fun main() {
    val student = Student()
//    student.marks = 70
//    student.marks = 80

    student.age = 13
    println(student.age)
    student.age = 12
    println(student.age)
    student.age = 15
    println(student.age)

}