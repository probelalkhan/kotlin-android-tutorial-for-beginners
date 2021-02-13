import java.lang.ArithmeticException
import java.lang.IllegalArgumentException

/*
* Throwable
* Exception
*  all other exceptions that are predefined
* */

class IllegalVoterException(message: String) : Exception(message)

fun vote(name: String, age: Int){
    if(age < 18)
        throw IllegalVoterException("Younger than 18 cannot vote")
    println("$name voted")
}


fun main(){

    try {
        vote("Belal", 17)
    }catch(e: Exception){
        e.printStackTrace()
    }catch(e: IllegalVoterException){
        e.printStackTrace()
    }finally {
        println("finally block")
    }

    val a = 10
    val b = 0

    val result = try {
        println("Inside Try Block")
        a / b
    } catch (e: ArithmeticException){
        println("Inside Catch Block")
        0
    }
    println("Result is $result")
}