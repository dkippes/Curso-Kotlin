package `20-breakAndContinue`

fun main(args: Array<String>) {
    println("****************************BREAK*******************************")
    var pairs = arrayListOf(1,2,3,4,5)
    for (pair in pairs) {
        if (pair % 2 == 0) {
            println("Pair found $pair")
            break
        }
    }

    println("****************************CONTINUE*******************************")
    for (pair in pairs) {
        if (pair % 2 == 0) {
            continue
        }
        println("Odd found $pair")
    }

    println("****************************LABEL*******************************") // Call the loop, is not quite useful
    loop@for(i in 1..5) {
        println(i)
    }
}