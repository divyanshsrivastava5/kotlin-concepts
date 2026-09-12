package oops

class Person(val name: String, val age: Int, val gender: String, val occupation: String) {
    fun work() {
        println("$name works as $occupation")
    }

    fun getAge() {
        println("$age years old")
    }

    fun getGender() {
        println("Gender is $gender")
    }
}

fun main() {
    val person = Person("John Doe", 23, "Male", "Developer")
    person.work()
    person.getAge()
    person.getGender()

    val secondPerson = Person("Smith Doe", 23, "Female", "Teacher")
    println(secondPerson.gender)
}