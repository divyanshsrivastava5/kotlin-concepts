package foundations

fun main() {
    val arr = arrayOf(1,2,3,4,5)
    val str = arrayOf<String>("a", "b", "c", "d", "e", "f")
    println(arr.contentToString())
    println(str.contentToString())

    for (item in arr) {
        print(item)
    }
    println()

    for (i in arr.indices) {
        print("${arr[i]} ")
    }
    println()

    for ((index, value) in arr.withIndex()) {
        print("$index and $value,")
    }
    println()

    println(str[2])
    println(str.get(3))
    arr[4] = 12
    str.set(3, "f")
}