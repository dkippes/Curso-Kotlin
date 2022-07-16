package `9-handlingExceptions`

import java.lang.Exception

fun main(args: Array<String>) {
    try {
        val test = ""
        // println(test?.toInt()) // NumberFormatException
    } catch (e : Exception) {
        e.printStackTrace() // Is red in the console text
        println("An exception happened because: " + e.message)
    } finally {
        println("The program finished")
    }

    println("****************************THROWS EXCEPTION*******************************")
    throw Exception("This input is not good")
}