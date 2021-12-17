fun main(args: Array<String>) {

    val n = 10
    var t1 = 0
    var t2 = 1
    var i = 1

    println("First $n tearms:")

    while(i <=n){
        println("$t1 +")

        val sum = t1 +  t2
        t1 = t2
        t2 = sum
        i++
    }
}
