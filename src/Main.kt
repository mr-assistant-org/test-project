fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    extracted()
}

private fun extracted() {
    for (i in 1..5) {
        println("i = $i")
    }
}