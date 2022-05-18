package ext

fun main() {

    data class Person(val name: String, val birthYear: Int)

    val personList = listOf(
        Person("유나", 1992),
        Person("조이", 1996),
        Person("츄", 1999),
        Person("유나", 2003)
    )

    var birthYearMap = personList.associateBy { it.birthYear }
    println(birthYearMap)

    var groupByNameMap = personList.groupBy { it.name }
    println(groupByNameMap)
    println(groupByNameMap["유나"])

    val (over98, under98) = personList.partition { it.birthYear > 1998 }
    println(over98)
    println(under98)

    println()

    val numbers = listOf(-3, 7, 2, -10, 1)
    var flatMap = numbers.flatMap { listOf(it * 10, it + 20) }
    println(flatMap)

    println(numbers.getOrElse(1) { 50 })
    println(numbers.getOrElse(10) { 50 })

    val names = listOf("A", "B", "C", "D")
    println(names zip numbers)

}