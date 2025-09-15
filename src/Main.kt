
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    printNumbers()
}

private fun printNumbers() {
    printNumbersFromOneToFive()
}

private fun printNumbersFromOneToFive() {
    for (i in 1..5) {
        println("i = $i")
    }
}
