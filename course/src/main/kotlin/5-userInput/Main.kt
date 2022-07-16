package `5-userInput`

import kotlin.random.Random

fun main(args: Array<String>) {
    println("Input your age:")
    val userInput = readLine() ?: "" // is read as String
    println("Your age is $userInput")
    println("Your age multiplied by 2 is ${userInput.toInt() * 2}")

    println("****************************RANDOM*******************************")
    println(Random.nextInt())
    println(Random.nextInt(10))
    println(Random.nextInt(20, 30))
}