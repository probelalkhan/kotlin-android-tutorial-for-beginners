//class ArrayUtil<T>(private val array: Array<T>){
//    fun findElement(element: T, foundElement: (index: Int, element: T?) -> Unit){
//        for(i in array.indices){
//            if(array[i] == element){
//                foundElement(i, array[i])
//                return
//            }
//        }
//        foundElement(-1, null)
//        return
//    }
//}

fun<T> findElement(array: Array<T>, element: T, foundElement: (index: Int, element: T?) -> Unit){
    for(i in array.indices){
        if(array[i] == element){
            foundElement(i, array[i])
            return
        }
    }
    foundElement(-1, null)
    return
}

fun<X, Y> justForTesting(param1: X, param2: Y){
    println("$param1 and $param2")
}

fun main() {

    justForTesting<String, Int>("3", 4)


    findElement(arrayOf(1,2,3,4,5), 3) {index, element ->
        println("Index $index")
        println("Element $element")
    }
}