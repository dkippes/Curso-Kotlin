package `19-while`

fun main(args: Array<String>) {
    println("****************************WHILE*******************************")
    var pieces = 5
    while (pieces > 0) {
        println(pieces)
        pieces -= 1
    }

    println("****************************DO WHILE*******************************")
    var i = 0
    do {
        println(i)
        i++
    } while (i <= 5)

    println("****************************NESTED*******************************")
    var j = 0
    while (j < 3) {
        var k = 0
        while (k < 2) {
            println("$j - $k")
            k += 1
        }
        j += 1
    }
}