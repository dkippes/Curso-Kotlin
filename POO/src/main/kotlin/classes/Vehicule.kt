package classes

open class Vehicule {
    var topSpeed = 100

    constructor() {
    }

    constructor(topSpeed: Int) {
        this.topSpeed = topSpeed
    }

    fun drive(speed: Int) {
        println("Driving at a speed to $speed")
    }
}