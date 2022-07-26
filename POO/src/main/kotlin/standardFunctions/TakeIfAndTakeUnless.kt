package standardFunctions

import kotlin.random.Random

fun main() {
    // TakeIf
    val number = Random.nextInt(100)
    val evenOrNull = number.takeIf { it % 2 == 0 }
    println("The number is $number")
    println("The evenOrNull is $evenOrNull")

    // TakeUnless
    val number2 = Random.nextInt(100)
    val oddOrNull = number2.takeUnless { it % 2 == 0 }
    println("The number2 is $number2")
    println("The evenOrNull is $oddOrNull")
}