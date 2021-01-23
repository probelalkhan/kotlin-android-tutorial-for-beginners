open class Address{
    public val test = "Hello"
}
data class Person(
        val id: String,
        val fname: String,
        val lname: String,
        val country: String
) : Address(){
    fun getName() = "$fname $lname"
}

fun main() {
    val person = Person("1", "Belal", "Khan", "India")
    val person1 = Person("1", "Belal", "Khan", "India")
    println(person == person1)
    println(person.getName())
    println(person.test)
    //componentN
//    println(person.component1())
//    println(person.component2())
//    println(person.component3())
//    println(person.component4())

    val (id, fname, lname, country ) = person //destructuring delcaration

    println(id)
    println(fname)
    println(lname)
    println(country)

}