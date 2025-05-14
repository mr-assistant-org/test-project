
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    printNumbersFromOneToFive()
}

private fun printNumbersFromOneToFive() {
    for (i in 1..5) {
        println("i = $i")
    }
}
