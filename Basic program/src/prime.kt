//fun main(args: Array<String>){
//
//    var num = 29
//    var flag = false
//
//    for (i in 2..num/ 2){
//        if (num % i==0)
//            flag = true
//        break
//    }
//
//    if (!flag){
//        println("$num is a prime number")
//    }else
//        println("$num is a prime number")
//
//}

fun main(args:Array<String>){

//  var num = 30
//    var i = 2
//    var flag = false
//
//    while (i<= num/2){
//        if (num % i==0)
//            flag=true
//        i++
//    }
//
//    if (!flag){
//        println("$num is a prime number")
//    }else
//        println("$num is a not prime number")


    var low = 20
    var high = 50

    while (low < high) {
        var flag = false

        for (i in 2..low / 2) {
            if (low % i == 0) {
                flag = true
                break
            }
        }
        if (!flag)
            println("$low")
        low ++
    }



}