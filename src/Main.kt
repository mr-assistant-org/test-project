
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    printNumbers(1, 5)
}

private fun printNumbers(start: Int, end: Int) {
    for (i in start..end) {
        println("i = $i")
    }
}
