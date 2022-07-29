import kotlinx.coroutines.*

// Provide lifecycle methods for coroutines, allow us to start and stop coroutines
// GlobalScope.launch{} - the scope of the coroutines is the lifecycle of the entire application
// runBlocking - creates a scope and runs a coroutine in a blocking way
// coroutinesScope{} - creates a new scope does not complete until all children coroutines complete
fun main() {
    println("Program execution will now block")
    runBlocking { // We block the execution
        launch {
            delay(1000L)
            println("Task from runBlocking")
        }

        GlobalScope.launch {
            delay(500L)
            println("Task from GlobalScope")
        }

        coroutineScope {
            launch {
                delay(1500L)
                println("Task from CoroutineScope")
            }
        }
    }
    println("Program execution will now continue")
}