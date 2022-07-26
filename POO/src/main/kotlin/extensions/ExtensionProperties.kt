package extensions

fun main() {
    println("Michael".betterLength)
}

val String.betterLength: Int // You can only use val
    get() = 200