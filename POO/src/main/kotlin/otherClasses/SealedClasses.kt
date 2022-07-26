package otherClasses

fun main() {
    val somePlant = getPlant()

    when(somePlant) {
        is Fruit -> println("Is a fruit")
        is Vegetable -> println("Is a vegetable")
    }
}

fun getPlant(): Plant = Apple()

abstract class Plant

sealed class Fruit: Plant()

sealed class Vegetable: Plant()

class Apple: Fruit()

class Potato: Vegetable()

