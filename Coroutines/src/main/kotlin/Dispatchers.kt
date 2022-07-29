import kotlinx.coroutines.*

// A dispatcher determines which thread or thread pool the coroutine runs on
// Different dispatchers are available depending on the task specificity
// Main -> Main thread upodate in UI driven applications (Android)
// Main dispatcher needs to be defined in Gradle
// Default -> Useful for CPU intense work
// IO -> Useful for network commnication or reading/writing files
// Unconfined -> Starts the coroutine in the inherited dispatcher that called it
// newSingleThreadContext("MyThread") -> Forces creation of a new thread
fun main() {
    runBlocking {
        // we cant use it in gradel, but you can in android
//        launch(Dispatchers.Main) {
//            println("Main dispatcher. Thread: ${Thread.currentThread().name}")
//        }

        launch(Dispatchers.Unconfined) {
            println("Unconfined1. Thread: ${Thread.currentThread().name}")
            delay(100L)
            println("Unconfined1. Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default. Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO. Thread: ${Thread.currentThread().name}")
        }

        launch(newSingleThreadContext("MyThread")) {
            println("newSingleThreadContext. Thread: ${Thread.currentThread().name}")
        }
    }
}