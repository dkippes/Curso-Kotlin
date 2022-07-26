package otherClasses

fun main() {
    val color = ColorsEnum.BLUE
    when(color) {
        ColorsEnum.RED -> println("The color chose is red")
        ColorsEnum.BLUE -> println("The color chose is blue")
        ColorsEnum.GREEN -> println("The color chose is green")
    }

    println(ColorsEnum.RED.timesUsed)
    println(ColorsEnum.RED.name)
    println(ColorsEnum.RED.ordinal) // Position
}

enum class ColorsEnum(val timesUsed: Int) {
    RED(34),
    GREEN(24),
    BLUE(45)
}