fun main(args:Array<String>) {

    var str = " this website is awesome"
    val ch = 't'
    var frequency = 0

    for (i in 0..str.length - 1) {
        if (ch == str[i]){
            frequency++
    }

}
    println("Frequency of $ch = $frequency")
}