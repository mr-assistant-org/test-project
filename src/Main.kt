
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    printOneToFive()
}

private fun printNumbersFromOneToFive() {
    for (i in 1..5) {
        println("i = $i")
    }
}

private fun printOneToFive() {
    for (i in 1..5) {
        println("i = $i")
    }
}
