# StandardIOSum

This is the repository for test kotlin with stdinIo

## original solution

```kotlin
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
```
I use java.util.Scanner to Read Standard Input

use repeat to do the scan

## my teacher reccachao's solution

[reccachao kotlin kata a + b](https://gitpage.reccachao.net/kotlin/kata/a-plus-b/)
```kotlin
fun readAndWriteSum() {
    fun readLn() = readLine()!!
    fun readInt() = readLn().toInt()
    fun readStrings() = readLn().split(" ")
    fun readInts() = readStrings().map { it.toInt() }
    
    val n = readInt()
    for (i in 1..n) {
        val (a, b) = readInts()
        println(a + b)
    }
}
```

這樣的作法

完全只需要使用 kotlin 原生的 readLine

就可以完成這個處理

使用 operator map 讓語法變得更簡潔易懂

這是 kotlin 吸引人的地方