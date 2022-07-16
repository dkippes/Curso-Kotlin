package `15-if`

fun main(args: Array<String>) {
    println("****************************IF*******************************")

    val night = true

    if (night) {
        println("Sleep")
    } else {
        println("Be active")
    }

    println("****************************IF ELSE*******************************")
    val isCat = true
    val isHuman = false

    if (isHuman && true) {
        println("Is animal")
    } else if (isCat || !false){
        println("Is a cat")
    } else {
        println("Is not human")
    }

    println("****************************SHORTHAND IF*******************************")
    val isPair = if (25%2 ==0)  "pair" else "odd"
    println(isPair)

    println("****************************WHEN CONDITIONAL*******************************") // SWITCH
    val heroe = "Ironman"
    var isTheHeroe : String
    when(heroe) {
        "Captain America" -> {
            isTheHeroe = "He has diamond skin"
        }
        "Ironman" -> {
            isTheHeroe = "He is made by iron"
        }
        else -> {
            isTheHeroe = "Is not a heroe"
        }
    }
//    when(heroe) {             SIMPLE WHEN/SWITCH
//        "Captain America", "Hulk" -> isTheHeroe = "He has diamond skin"
//        "Ironman" -> isTheHeroe = "He is made by iron"
//        else -> isTheHeroe = "Is not a heroe"
//    }
    println(isTheHeroe)

    println("****************************RANGE*******************************")
    val numbers = 2
    if (numbers !in 5..9)
        println("Is not between 5 and 9")

    println("****************************BOOLEAN RETURNING FUNCTIONS*******************************")
    var horses = arrayListOf("Horse1")
    if (horses.add("House2"))
        println("House added correctly")
    println(horses)


}