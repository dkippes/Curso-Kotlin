package standardFunctions

fun main() {
    val animals = listOf("cat", "dog", "mouse", "bear", "zebra")
    animals.map { it.length }
        .filter { it > 3 }
        .let { filteredList -> // Podes hacer acciones con varios o un elemento
            println(filteredList)
            println("Size of list is ${filteredList.size}")
        }

    val name = readLine()
    name?.let { // Te permite no ejecutarlo si es null, es un null safe
        println("Your name is $name")
    }
}