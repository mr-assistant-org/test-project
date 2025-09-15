
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    printNumbers1To5()
}

private fun printNumbers1To5() {
    for (i in 1..5) {
        println("i = $i")
    }
}
