import kotlin.random.Random
import kotlin.system.exitProcess

val words = listOf("elbow", "writer", "circle", "polish", "bridge", "store", "fang", "scarecrow", "show", "jeans", "wilderness", "attempt", "wax", "aftermatch", "banana", "wrist", "wheel", "spring", "cherries", "nerve")
var word = ""
val guesses = arrayListOf<Char>()
var remainingGuesses = 6
var mistakes = 0

fun main(array: Array<String>) {
    setupGame()
}

fun setupGame() {
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex]
    println(word)

    for (i in word.indices)
        guesses.add('_')

    var gameOver = false

    do {
        printGameStatus()
        println("Please enter a letter:")
        val input = readLine()?:""

        if (input.isEmpty()) {
            println("That is not a valid input. Please try again")
        } else {
            val letter = input[0].toLowerCase()
            if (word.contains(letter)) {
                for (i in word.indices) {
                    if (word[i] == letter)
                        guesses[i] = letter
                }
                if (!guesses.contains('_')) {
                    gameOver = true
                }
            } else {
                println("Sorry, that is not part of the word")
                remainingGuesses--
                mistakes++
                if (mistakes == 6)
                    gameOver = true
            }
        }
    } while (!gameOver)

    if (mistakes == 6) {
        printGameStatus()
        println("Sorry, you lost. The word was $word")
    } else {
        println("Congratulations, you win! The word was $word")
    }
}

fun printGameStatus() {
    when(mistakes) {
        0 -> print0Mistakes()
        1 -> print1Mistakes()
        2 -> print2Mistakes()
        3 -> print3Mistakes()
        4 -> print4Mistakes()
        5 -> print5Mistakes()
        6 -> print6Mistakes()
    }

    println("Word: ")
    for (element in guesses) {
        print("$element ")
    }
    println("\nYou have $remainingGuesses guess(es) left")
}

fun print0Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print1Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      0 ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print2Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      0 ")
    println("  |      | ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print3Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      0 ")
    println("  |     /| ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print4Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      0 ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print5Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      0 ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     /  ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print6Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      0 ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     / \\")
    println(" /|\\      ")
    println("/ | \\     ")
}