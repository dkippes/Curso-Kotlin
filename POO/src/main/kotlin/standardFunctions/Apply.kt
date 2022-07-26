package standardFunctions

fun main() {
    // Es como el Run y devuelve el objeto inicial
    val myCar = MyCar().apply {
        speed = 50
        color = "red"
        starCar()
    }
    println(myCar)
}

class MyCar {
    var speed = 10
    var color = "blue"
    fun starCar() {
        println("Starting the car, speed is $speed, color is $color")
    }
}