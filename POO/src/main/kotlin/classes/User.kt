package classes

abstract class User(private var age: Int?) {
    fun getAge(): Int? {
        return age
    }
}