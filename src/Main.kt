
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    printSequentialNumbers()
}

private fun printSequentialNumbers() {
    for (i in 1..5) {
        println("i = $i")
    }
}
