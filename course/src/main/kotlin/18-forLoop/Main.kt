package `18-forLoop`

fun main(args: Array<String>) {
    println("****************************FOR LOOP*******************************")
    val animals = arrayListOf("cat", "dog", "mouse", "bear")
    for (animal in animals) {
        println("Feed the $animal")
    }

    println("****************************UNTIL*******************************")
    for (i in 0 until  5 step 2) {
        println(i)
    }

    println("****************************DOWN TO*******************************")
    for (i in 10 downTo 5) {
        println(i)
    }

    println("****************************NESTED*******************************")
    for (i in 1..2) {
        for (j in 1..3) {
            println("$i - $j => \uD83D\uDE00")
        }
    }
}