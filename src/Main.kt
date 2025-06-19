
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    printNumbersFromOneToFive()
    printNumbers()
}

private fun printNumbersFromOneToFive() {
    for (i in 1..5) {
        println("i = $i")
    }
}

private fun printNumbers() {
    for (i in 1..5) {
        println("i = $i")
    }
}
