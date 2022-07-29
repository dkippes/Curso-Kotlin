import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// A .launch() call returns a Job
// Allows us to manipulate the coroutine lifecycle
// Live in the hierarchy of other Jobs both as parents or children
// Can access lifecycle variables and methods - cancel() | join()
// If a job is cancelled, all its parents and children will be cancelled too
fun main() {
    runBlocking {
        val job1 = launch {
        //    delay(3000L)
            println("Job1 launched")
            val job2 = launch {
                println("Job2 launched")
                delay(3000L)
                println("Job2 is finishing")
            }
            job2.invokeOnCompletion { println("Job2 completed") }

            val job3 = launch {
                println("Job3 launched")
                delay(3000L)
                println("Job3 is finishing")
            }
            job2.invokeOnCompletion { println("Job3 completed") }
        }

        job1.invokeOnCompletion { println("Job1 completed") }

        delay(500L)
        println("Job1 will be cancelled")
        job1.cancel()
    }
}