package extensions

// Creating your own functions
fun main() {
    val name = "Michael"
    println(name.slim())
}

fun String.slim(): String { // fun String.slim() = this.substring(1, length-1)
    return this.substring(1, length-1)
}