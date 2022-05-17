package ext

fun main() {

    println("문자열을 다루는 법")
    caseOne()
    caseTwo()
    caseThree()

}

fun caseOne() {
    var test1 = "Test.Kotlin.String"

    println(test1.length)
    // 18

    println(test1.lowercase())
    // test.kotlin.string

    println(test1.uppercase())
    // TEST.KOTLIN.STRING

    // split = 정규식, 일반문자열
    var test2 = test1.split(".")
    println(test2)
    // [Test, Kotlin, String]

    println(test2.joinToString())
    // Test, Kotlin, String

    println(test2.joinToString("-"))
    // Test-Kotlin-String

    println(test1.substring(5..10))
    // Kotlin
}

fun caseTwo() {
    var nullString: String? = null
    var emptyString = ""
    var blankString = " "
    var normalString = "A"

    println(nullString)
    println(emptyString)
    println(blankString)
    println(normalString)

    // 비어있는지를 체크
    // isNullOrEmpty() : null 이거나 empty 이면 true : null, "", 눈에보이지않는문자
    println(nullString.isNullOrEmpty()) // true
    println(emptyString.isNullOrEmpty()) // true
    println(blankString.isNullOrEmpty()) // false
    println(normalString.isNullOrEmpty()) // false

    // isNullOrBlank() : null 이거나 blank 이면 true : null, "", " "
    println(nullString.isNullOrBlank()) // true
    println(emptyString.isNullOrBlank()) // true
    println(blankString.isNullOrBlank()) // true
    println(normalString.isNullOrBlank()) // false
}

fun caseThree() {

    var test3 = "kotlin.kt"
    var test4 = "java.java"

    println(test3.startsWith("java")) // false
    println(test4.startsWith("java")) // true

    println(test3.endsWith(".kt")) // true
    println(test4.endsWith(".kt")) // false

    println(test3.contains("lin")) // true
    println(test4.contains("lin")) // false

}