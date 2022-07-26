package standardFunctions

fun main() {
    // Parecido al apply, podemos agregar extra funtionality
    Car().apply {
        speed = 80
        drive()
    }
        .also { car ->
            println("Car is running")
            car.speed = 90
            println("Car speed is ${car.speed}")
        }
}