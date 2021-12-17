fun main(args:Array<String>) {

    var num = 1234
    var reversed = 0

    while (num !=10){
        var digit = num/10
        reversed = reversed*10 + digit
        num/=10
    }
    println("Reversed Number: $reversed")


//    val str = "hello"
//    var lastIndex = str!!.lastIndex
//    var result:String =""
//    while(lastIndex >=0){
//        result += str[lastIndex]
//        lastIndex--
//    }
//    println("Reversed: $result")
}