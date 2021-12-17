//fun main(args: Array<String>) {
//
//
//    val n1 = 72
//    val n2 = 120
//    var lcm :Int
//
//    lcm = if (n1 > n2) n1 else n2
//
//    while (true){
//        if (lcm %n1 == 0 && lcm %n2 == 0 ){
//
//            println("The LCM of $n1 and $n2 = $lcm")
//            break
//        }
//        ++lcm
//    }
//
//
//}





fun main(args: Array<String>){

    var n1 = 72
    var n2 = 120
    var lcm: Int

    lcm = if (n1 < n2) n1 else n2

    while (true){
        if (lcm % n1 ==0 && lcm %n2 ==0){
            println("LCM of $n1 and $ n2 = $lcm ")
            break
        }
        lcm++
    }
}