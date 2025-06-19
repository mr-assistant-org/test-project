
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    printNumbersFromOneToFive()
    displayNumbersOneToFive()
}

private fun printNumbersFromOneToFive() {
    for (i in 1..5) {
        println("i = $i")
    }
}

private fun displayNumbersOneToFive() {
    for (i in 1..5) {
        println("i = $i")
    }
}
