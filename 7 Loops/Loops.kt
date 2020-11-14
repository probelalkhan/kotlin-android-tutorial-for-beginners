fun main() {
    val a: IntArray = intArrayOf(2, 3, 4, 5)
    var i = 1

    for(x in 1..10){
        print("$x  ")
    }

    for(y in a.indices){
        println(a[y])
    }


//    while(i <= 10){
//        print("$i  ")
//        i+=2
//    }

//    do {
//        print("$i  ")
//        i += 2
//    } while (i <= 10)

}