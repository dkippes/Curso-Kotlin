package classes

class Car : Vehicule {
    var model: String? = null

    constructor() {
    }

    constructor(model: String, topSpeed : Int) : super(topSpeed) {
        this.model = model
    }

    fun start() {
        println("Starting the $model")
    }
}