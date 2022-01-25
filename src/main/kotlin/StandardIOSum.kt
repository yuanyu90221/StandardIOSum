//import java.util.Scanner

fun readAndWriteSum() {
    /*val content = Scanner(System.`in`)
    val turns = content.nextLine().toInt()
    repeat(turns) {
        i ->
        run {
            val firstNumber = content.nextInt()
            val secondNumber = content.nextInt()
            println("${firstNumber+secondNumber}")
        }
    }*/
    fun readLn() = readLine()!!
    fun readInt() = readLn().toInt()
    fun readStrings() = readLn().split(" ")
    fun readInts() = readStrings().map { it.toInt() }
    // read loop number
    val n = readInt()
    for (i in 1..n) {
        val (a, b) = readInts()
        println(a+b)
    }
}