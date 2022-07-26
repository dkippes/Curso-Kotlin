package otherConcepts

fun main() {
    val value = "Testing"
    if (value is String)
        println("This string has ${value.length} chars")

    val myCar: Car = getCar()
    if (myCar is BMW)
        (myCar as BMW).drive()

    val bmwCar = myCar as? BMW
    bmwCar?.drive()
}

open class Car{}

class BMW: Car() {
    fun drive() {
        println("Driving my BMW")
    }
}

fun getCar(): Car = BMW()