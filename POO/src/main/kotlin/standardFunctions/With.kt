package standardFunctions

fun main() {
    //Es similar a Let pero le pasas el objeto para que ejecute sus cosas
    with(Car()) {
        speed = 90
        drive()
        println("Car is driving")
        println(this)
    }
}

class Car {
    var speed = 80
    fun drive() {
        println("Driving at $speed")
    }
}