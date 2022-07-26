package otherClasses
fun main() {
    val myUser = UserDataClass("Diego", "kippes@gmail.com", "1234")
    println(myUser)

    val myUser2 = UserDataClass("Diego", "kippes@gmail.com", "1234")

    // Methods
    println(myUser == myUser2) // Equals or == is the same and compare attributes
    val user3 = myUser.copy(email = "email@email.com")
    println(user3)
}

// Data Class
data class UserDataClass(
        val name: String,
        val email: String,
        val password: String
)