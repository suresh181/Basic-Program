fun main(args:Array<String>){

//    val row = 5
//    for (i in row downTo  1){
//        for (j in 1..i){
//            print("*")
//        }
//        println()
//    }
//
//
//
//    val last = 'E'
//    var alph = 'A'
//
//    for (i in 1..last-'A'+1){
//        for (j in 1..i){
//            print("$alph")
//        }
//        ++alph
//        println()
//    }

//    var rows = 5
//    var k = 0
//
//    for (i in 1..rows){
//        for (space in 1..rows-i){
//            print("")
//
//        }
//        while (k!=2 *i-1){
//            print("*")
//            ++k
//        }
//        println()
//        k = 0
//    }

//    var rowss= 5
//    var ks = 0
//    var count = 0
//    var count1 = 0
//
//    for (j in 1..rowss) {
//        for (space in 1..rowss - j) {
//            print("")
//            count++
//        }
//        while (ks != 2 * j - 1) {
//            if (count <= rowss - 1) {
//                print((j + ks).toString() + "")
//                count++
//            } else {
//                count1++
//                print((j + ks - 2 * count1).toString() + "")
//            }
//            ++ks
//        }
//        ks = 0
//        count = ks
//        count1 = count
//
//        println()
//    }

    val row = 5
    for (i in row downTo 1) {
        for (space in 1..row - i) {
            print("  ")
        }

        for (j in i..2 * i - 1){
            print{"* "}
        }
        for (j in 0..i-1-1){
            print("* ")
    }

    println()
}


}
