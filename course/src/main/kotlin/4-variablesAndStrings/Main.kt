package `4-variablesAndStrings`

const val URL = "http://google.com"

fun main(args: Array<String>) {
    println("Hello \"yes\" World!")
    println('C')
    var tv = "Old Television" // Cannot change the type (CONST)
    val cannotBeChange = "This value cannot be changed"
    tv = "New Television"
    println(tv)
    println(cannotBeChange)

    println("****************************STRINGS*******************************")
    val cocodrile = "Cocodrile"
    println("cocodrile.length: " + cocodrile.length)
    val cocodrileTrim = "      CocodrileTrim     "
    println("cocodrile.trim(): " + cocodrile.trim())
    println("cocodrile[3]: " + cocodrile[3])
    println("cocodrile.get(4): " + cocodrile.get(4))
    println("cocodrile.substring(4): " + cocodrile.substring(4))
    println("cocodrile.substring(3,5): " + cocodrile.substring(3,5))

    println("****************************TEMPLATES*******************************")
    val name = "Diego"
    println("Hi my name ${name}, nice to meet you")
    println("****************************CONSTANTS*******************************")
    println(URL)

}