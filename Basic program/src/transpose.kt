import kotlin.Array as Array

fun main(args: Array<String>){
    var row =2
    var column = 3
    val matrix = arrayOf(intArrayOf(2,3,4), intArrayOf(5,6,4))

    display(matrix)

    val transpose= Array(column){IntArray(row)}
    for (i in 0..row -1){
        for (j in 0 .. column-1){
            transpose[j][i] = matrix[i][j]
        }
    }
    display(transpose)
}



fun display(matrix: Array<IntArray>) {
    println("the matrix is:")
    for(row in matrix){
        for(column in row){
            print("$column ")
        }
        println()
    }
}