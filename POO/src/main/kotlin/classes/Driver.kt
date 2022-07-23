package classes

class Driver: User, Printable { // Extends from abstract class (User) and interface Printable
    private lateinit var name: String
    private lateinit var car: Car

    init {
        println("Making a new Driver!")
    }

    constructor() : super(age = null) {

    }

    constructor(name: String, car: Car, age: Int) : super(age) {
        this.name = name
        this.car = car
    }

    fun getCar() : Car {
        return car
    }

    fun getName() : String {
        return name
    }

    companion object {
        fun provideDrivingInstructions() : String {
            return "Drive safe! - Its work like static in java"
        }
    }

    /**********INTERFACE *********/
    override fun printAttributes() {
        println("The name is $name")
        println("The car model is ${car.model}")
    }
}