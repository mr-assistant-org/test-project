
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    printSequence()
}

private fun printSequence() {
    for (i in 1..5) {
        println("i = $i")
    }
}
