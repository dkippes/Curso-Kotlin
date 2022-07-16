package `23-lambdaFunctions`

fun main(args: Array<String>) {
    println("****************************LAMBDA*******************************")
    hi("Pepe")

    println("****************************HIGHER ORDER FUNCTIONS*******************************") // Function as parameter
    val names = arrayListOf("Tobi", "Marta")
    sayHelloTo(names, hi)

    println("****************************FOR EACH*******************************")
    val clients = arrayListOf("Pepe", "Bob", "Carola")
    clients.forEach { println("Hi $it") }

    println("****************************FILTER*******************************")
    val bob = clients.filter { it.equals("Bob") }
    println(bob)

    println("****************************MAP*******************************")
    val lengtClients = clients.map { it.length }
    println(lengtClients)

    println("****************************SORT*******************************")
    println(lengtClients.sortedBy { it })

    println("****************************MAX*******************************")
    println(lengtClients.maxByOrNull { it })
}

var hi : (String) -> Unit = { name : String -> println("Hello $name")} // Lambda

fun sayHelloTo(names : ArrayList<String>, doSomething: (String) -> Unit) { // Unit means no return
    for (name in names) {
        doSomething(name)
    }
}