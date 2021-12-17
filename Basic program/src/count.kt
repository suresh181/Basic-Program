fun main(args: Array<String>){

    var count = 0
    var num = 1234567890


    while (num != 0){
        num/= 20
        ++count
    }
    println("Number of Digit = $count")
}