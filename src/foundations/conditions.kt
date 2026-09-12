package foundations

fun main() {
    val a = 10
    val b = 20

    /**
     * if-else
     */
    if (a > b) {
        println("a is greater")
    } else {
        println("a is smaller")
    }

    // no ternary operator in kotlin instead if else can be used as expression
    println(if (a > b) a else b)
    val c = if (a > b) a else b // returns 0
    println(c)
    var d = if (a > b) a else if (a > c) a else c
    println(d)

    /**
     * when (switch of Kotlin)
     * similarly as if-else can be used as statement or expression
     */
    var x = 50
    var y = 10
    var opr = "add"

     val ans = when(opr) {
        "add" -> {
            x + y
        }
        "sub" -> x - y
        "multi" -> x * y
        "div" -> x / y
        "mod" -> x % y
        else -> 0 // else is required only while return the 'when' expression
    }

    println(ans)

    // ranges
    when(a) {
        11 -> println("value is 11")
        12 -> println("value is 12")
        in 13..16 -> {
            println("Number is between 13 and 16")
        }
        in 17 until 19 -> {
            println("Number is between 17 and 19")
        }
        !in 20..21 -> {
            println("Number is not in between 20 and 21")
        }
    }
}