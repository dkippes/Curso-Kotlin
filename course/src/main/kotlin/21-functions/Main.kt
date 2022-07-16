package `21-functions`

fun main(args: Array<String>) {
    println("****************************SIMPLE*******************************")
    sayHello()

    println("****************************RETURN/PARAMETER*******************************")
    println(sayHello("Diego"))
    println(sayHello(150))
    println(sayHello(null))
    println(number())
    println(array(arrayOf("Diego", "Pepe")))

    println("****************************VARARG*******************************")
    varArg("Cat", "Dog")

    println("****************************LOCAL FUNCTION*******************************")
    fun localFunction() {
        println("Is a local function")
    }
    localFunction()
}

fun sayHello() {
    println("Hello Word")
}

fun sayHello(name: String = "Default Name") : String {
    return "Hello $name"
}

fun sayHello(name: Int?) : String {
    return "Hello $name"
}

fun number(number: Int = 0) : String {
    return "The number is $number"
}

fun array(strings: Array<String>) : Array<String> = strings

fun varArg(vararg animals: String) {
    for (animal in animals) {
        println(animal)
    }
}
