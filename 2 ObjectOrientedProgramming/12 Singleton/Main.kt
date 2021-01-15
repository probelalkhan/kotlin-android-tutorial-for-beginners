object Manager {
    init {
        println("Manager Object Initialized")
    }
}

//Singleton the old way
class Manager1 private constructor() {
    companion object {
        private var instance: Manager1? = null
        operator fun invoke(): Manager1 = synchronized(this) {
            if (instance == null)
                instance = Manager1()
            return instance!!
        }
    }
}

fun main() {
    println(Manager)
    println(Manager)
}