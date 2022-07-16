package `8-nullability`

fun main(args: Array<String>) {
    val herName : String = "Lily"
    val myName : String? = null // Safe null
    println(herName)
    println(myName)

    println("****************************NULL SAFE CALL*******************************")
    println(myName?.length?.toString())
    var number = 13
    var nullNumber : Int? = null
    println(number?.plus(2))
    println(nullNumber?.plus(2))

    println("****************************ELVIS OPERATOR | DEFAULT VALUE*******************************")
    val catName : String? = null
    println(catName ?: "Akira") // if null => Akira

    println("****************************ELVIS OPERATOR | DEFAULT VALUE*******************************")
    println(catName!!.length) // !! garanties that the value is not null
}