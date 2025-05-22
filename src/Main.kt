
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    printSequentialNumbersFromOneToFive()
}

private fun printSequentialNumbersFromOneToFive() {
    for (i in 1..5) {
        println("i = $i")
    }
}
