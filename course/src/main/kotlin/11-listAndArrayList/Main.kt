package `11-listAndArrayList`

fun main(args: Array<String>) {
    println("****************************LIST*******************************") // INMMUTABLE

    val colorsList = listOf("blue", "red", "yellow", null, 3, true, listOf("Nothing")) // listOf cannot add new elements
    println(colorsList)
    val colorsList2 = listOf<String>()
    println(colorsList2)
    println(colorsList.get(2))
    println(colorsList[3])

    println("****************************ARRAY LIST*******************************") // MUTABLE
    val colorsArrayList = arrayListOf("blue", "red", "yellow", null) // Cannot add differents types except null
    println(colorsArrayList)
    colorsArrayList.add("Diego")
    colorsArrayList.remove("red")
    println(colorsArrayList)
    colorsArrayList.removeAt(1)
    colorsArrayList.addAll(listOf("Orange", "Brown"))
    println(colorsArrayList)

    println("****************************LIST FUNCTIONS*******************************")
    println(colorsList.size)
    println(colorsList.contains("red"))
    println(colorsList.containsAll(listOf("red", null)))
    println(colorsList.indexOf("red")) // -1 if not found
    println(colorsList.lastIndexOf("yellow")) // -1 if not found

    println("****************************ARRAY LIST FUNCTIONS*******************************")
    colorsArrayList.set(3, "Pink") // Replaced Orange
    println(colorsArrayList)
    println(colorsArrayList.subList(1, 2))
    println(colorsArrayList.isEmpty())
    colorsArrayList.clear()
    println(colorsArrayList)
}