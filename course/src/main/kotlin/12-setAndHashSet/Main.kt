package `12-setAndHashSet`

fun main(args: Array<String>) {
    println("****************************SET*******************************") // INMMUTABLE
    val numbersSet = setOf(6, 37, 6, 32) // Not duplicated
    println(numbersSet)
    val numberSetEmpty = setOf<Int?>(5, null, 7, null) // with ? can have nulls
    println(numberSetEmpty)

    println("****************************HASH SET*******************************") // MUTABLE
    val numbersHashSet = hashSetOf(8, 9, 10, 2, null) // Not duplicated
    numbersHashSet.add(4) // addAll
    numbersHashSet.remove(8) // removeAll
    println(numbersHashSet)

    println("****************************SET FUNCTIONS*******************************")
    println(numbersSet.size)
    println(numbersSet.contains(32))
    println(numbersSet.containsAll(setOf(37, 6)))
    println(numbersSet.isEmpty())

    println("****************************HASH SET FUNCTIONS*******************************")
    println(numbersHashSet.retainAll(hashSetOf(9, 10)))
    numbersHashSet.clear()
    println(numbersHashSet)
}