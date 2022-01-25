import java.util.Scanner

fun readAndWriteSum() {
    val content = Scanner(System.`in`)
    val turns = content.nextLine().toInt()
    repeat(turns) {
        i ->
        run {
            val firstNumber = content.nextInt()
            val secondNumber = content.nextInt()
            println("${firstNumber+secondNumber}")
        }
    }
}