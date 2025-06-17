
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    displayNumbers()
}

private fun printNumbersFromOneToFive() {
    for (i in 1..5) {
        println("i = $i")
    }
}

private fun displayNumbers() {
    printNumbersFromOneToFive()
}
