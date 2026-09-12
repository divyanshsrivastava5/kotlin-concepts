package foundations

fun main() {
    val a = 10
    val b = 20

    println(add(a, b))
    println(add(a))
    print(add(x = b, y = a)) // named arguments
    sub(1,b)

//    var sum = ::add // function programming
    val sum: (Int, Int) -> Int = ::add
    print(sum(a, b))
}

fun add(x: Int, y: Int = 30): Int = x + y
fun add(x: Int, y: Int, z: Int) = x + y + z

fun sub(x: Int, y: Int) {
    print("$x,$y sub is ${x - y}")
}