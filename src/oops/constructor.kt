package oops

fun main() {
    val dog = Animal("Tom", 5, "Labrador", "Black")
    val cow = Animal("Power", "White")
}

class Animal(var name: String, var age: Int, var breed: String, var color: String) {
    // secondary constructor if args can be optionals
    constructor(animalName: String, animalColor: String) : this(animalName, 2, "Jersey", animalColor)

    // runs at object creation
    init {
        println("The name is $name and the age is $age")
    }

    init {
        println("The breed is $breed")
    }
}