package otherConcepts

import kotlin.random.Random

// Lazy variables are variables that are initilized when need
// Useful to save memory in case the variable is never accessed
fun main() {
    val someLargeVariable: String by lazy {
        "Some large value"
    }

    if (Random.nextInt() % 2 == 0)
        println(someLargeVariable)
}