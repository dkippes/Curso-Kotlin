package generics

fun main() {
    val chef = Chef<Apple>()
    chef.cook(Apple())
}

abstract class Fruit {
    abstract fun peel()
}

class Apple: Fruit() {
    override fun peel() {
        println("Peeling the apple")
    }
}

class Chef<T: Fruit> {
    fun cook(item: T) {
        item.peel()
    }
}