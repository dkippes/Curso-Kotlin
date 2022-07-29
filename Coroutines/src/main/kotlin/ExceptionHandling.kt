import kotlinx.coroutines.*
import java.lang.ArithmeticException
import java.lang.IndexOutOfBoundsException

// Exception behaviour depends on the coroutine builder

// Launch
    // Propagates through the parent-child hierarchy
    // The exception will be thrown immediately and jobs will fail
    // use try-catch or an exception handler

// Async
    // Exception are deferred until the result is consumed
    // If the result is not consumed, the exception is never thrown
    // try-catch in the coroutine or in the await() call
fun main() {
    runBlocking {
        // using Launch
        val myHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
            println("Exception handled: ${throwable.localizedMessage}")
        }

        val job = GlobalScope.launch(myHandler) {
            println("Throwing exception from job")
            throw IndexOutOfBoundsException("Exception in coroutine")
        }
        job.join()

        // using Async
        val deferred = GlobalScope.async {
            println("Throwing exception from async")
            throw ArithmeticException("Exception from async")
        }

        try {
            deferred.await()
        } catch (e: ArithmeticException) {
            println("Exception has been thrown in async")
        }
    }
}