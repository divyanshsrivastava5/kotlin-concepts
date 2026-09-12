package foundations

fun main() {
    val a = 14
    var b = 23
    b = 12 // should be of same type with which it was initialized
    print(a + b)
    val c = null
    lateinit var d: String // primitive types can not be market as lateinit and also not on val
    val e: Double = 12.0

    // String interpolation
    println("Hello $e")
    println("Sum of a and b is ${a + b}")
    print("c is $c")
}