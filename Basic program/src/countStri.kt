fun countOcc(s:String,ch:Char):Int{
    return s.filter { it==ch }.count()
}
fun main(args:Array<String>){
    val s = "hello"
    println("The Length of ${s.length}")
}