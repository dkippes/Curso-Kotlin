package extensions

fun main() {
    Book.printMe()
}

class Book {
    companion object { // static method

    }
}

fun Book.Companion.printMe() {
    println("Book printed")
}