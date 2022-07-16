package `6-numbersAndVariableTypes`

fun main(args: Array<String>) {
    val price = 34.55
    val items = 3
    var totalPrice = price * items
    println("Total price: $totalPrice")

    println("****************************TYPES*******************************")
    println("price type: " + price::class.java)
    println("items type: " + items::class.java)

    println("****************************SPECIFIED TYPE*******************************")
    val products: Int = 6
    println("products type: " + products::class.java)

    println("****************************CONVERSIONS TYPE*******************************")
    val longProducts = products.toLong()
    println("longProducts type: " + longProducts::class.java)
    val priceString : String = price.toString()
    println("priceString type: " + priceString::class.java + " is: " + priceString)
}