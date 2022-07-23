package classes

fun main() {
    val myCar: Car = Car()
    val youCar: Car = Car("Mercedes", 50)
    val driver: Driver = Driver("Diego", myCar, 25)

    myCar.model = "BMW"
    myCar.topSpeed = 1000

    println("My name is ${driver.getName()}")

    println("************************* PRINTING INTERFACE *************************")
    driver.printTheInterface()
    driver.printAttributes()

    println("************************* PRINTING STATIC METHOD *************************")
    println(Driver.provideDrivingInstructions())

    driver.getCar().start()
    driver.getCar().drive(50)
}