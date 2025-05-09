
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    printNumberSequence()
}

private fun printNumberSequence() {
    for (i in 1..5) {
        println("i = $i")
    }
}
