
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    displayNumbersOneToFive()
}

private fun displayNumbersOneToFive() {
    for (i in 1..5) {
        println("i = $i")
    }
}

private fun printNumbersFromOneToFive() {
    for (i in 1..5) {
        println("i = $i")
    }
}
