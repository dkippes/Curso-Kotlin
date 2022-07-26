package otherConcepts

// Allows us to create non null, non initialized variables
// Only on var variables

fun main() {
    lateinit var networkService: String // It has to be initialized or will throw an exception
    networkService = getNetworkService()
    println(networkService)
}

fun getNetworkService() = "Network service"