package chapter1

fun main() {

    println("논리연산자")

    // && : and 연산
    // || : or 연산
    // ! : not 연산

    println(true && true) // true
    println(true && false) // false
    println(false && false) // false

    println(true || true) // true
    println(true || false) // true
    println(false || false) // false

    println(!true) // false
    println(!false) // true

    println()

    var a = 6
    var b = 4
    println(a > 5 && b > 5) // true && false => false

}
