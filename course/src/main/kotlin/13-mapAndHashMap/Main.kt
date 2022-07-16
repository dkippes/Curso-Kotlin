package `13-mapAndHashMap`

fun main(args: Array<String>) {
    println("****************************MAP*******************************") // INMMUTABLE
    val countMap = mapOf(Pair(1, "One"), Pair(2, "Two"))
    println(countMap)
    val countEmptyMap = mapOf<Int, String>()
    println(countEmptyMap)
    println(countMap.get(2))
    println(countMap[1])
    println(countMap.keys)
    println(countMap.values) // Can have duplicates

    println("****************************HASH MAP*******************************") // MUTABLE
    val countHashMap = hashMapOf(Pair(4, "Four"), Pair(5, "Five"), Pair(6, "Six"))
    countHashMap.put(7, "Seven")
    countHashMap[8] = "Eight"
    println(countHashMap)
    countHashMap.putAll(mapOf(Pair(20, "Twenty")))
    countHashMap.remove(5)
    println(countHashMap)
    countHashMap.replace(4, "Cuatro")
    println(countHashMap)

    println("****************************HASH MAP FUNCTION*******************************")
    println(countHashMap.size)
    println(countHashMap.containsKey(2))
    println(countHashMap.containsValue("One"))
    println(countHashMap.isEmpty())
    println(countHashMap.isNotEmpty())
    countHashMap.clear()
    println(countHashMap)
}