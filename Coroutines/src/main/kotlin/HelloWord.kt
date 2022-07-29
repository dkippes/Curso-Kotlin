import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch { // Is the scope of the entire app - usually not use
        delay(1000L)
        println("World!")
    }
    println("Hello, ")
    Thread.sleep(2000L)
}