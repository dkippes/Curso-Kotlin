package otherClasses

fun main() {
    val myCar = Car()
    myCar.drive()
}

// Classes inside classes -> A class created inside another class
class Car {
    private val engine = Engine()
    var speed = 100
    fun drive() {
        engine.run()
        println("Driving at $speed")
    }

    private inner class Engine {
        val rpm = 300
        fun run() {
            this@Car.speed = 50 // If you modified the speed
            println("Engine is running at $rpm")
        }
    }
}