package etc

import java.util.*

fun main() {

    // apply
    // apply는 객체를 설정하는 상황에서 사용한다.
    // apply는 객체 자신을 다시 반환하기 때문에 특정 객체의 프로퍼티를 설정 후 바로 사용하기 쉽다.
    println("apply test")
    val adam = Person("Adam").apply {
        age = 32
        city = "seoul"
    }
    println("Person : ${adam.name}, ${adam.age}, ${adam.city}")

    println("")

    // also
    // also는 객체의 속성을 전혀 사용하지 않거나 이를 변경하지 않으면서 사용하는 경우에 사용한다.
    // 대표적으로 객체의 데이터 유효성을 확인하거나, 디버그, 로깅 등의 부가적인 목적으로 사용할 때에 적합하다.
    println("also test")
    val numbers1 = mutableListOf("one", "two", "three")
        .also { println("The list elemests before adding new one: $it") }

    numbers1.add("four")
        .also { println("The list elemests result adding new one : $it") }

    numbers1
        .also { println("The list elemests after adding new one: $it") }

    println("")

    // let
    // let은 call chain의 결과에서 1개 혹은 그 이상의 함수를 호출하는 데 사용할 수 있다.
    println("let test")
    val numbers2 = mutableListOf("one", "two", "three", "four", "five")
    val resultList = numbers2.map { it.length }.filter { it > 3 }
    println(resultList)

    val numbers3 = mutableListOf("one", "two", "three", "four", "five")
    numbers3.map { it.length }.filter { it > 3 }.let {
        println(it)
        // and more function calls if needed
    }

    // let은 non-null 값인 경우 코드 블럭을 실행하는 경우 많이 사용한다.
    // non-null 객체인 경우에만 호출하기 위해서 아래처럼 ?. 오퍼레이터를 함께 사용하면 된다.
//    val str: String? = null // 실행안됨
    val str: String? = "Hello" // 실행됨
    //processNonNullString(str)       // compilation error: str can be null

    val length = str?.let {
        println("let() called on $it")
        processNonNullString(it)      // OK: 'it' is not null inside '?.let { }'
        it.length
    }
    println("length : $length")

    // 또 객체를 지역 변수로 범위를 제한해서 사용할 경우 사용한다.
    // 아래 코드를 보면 firstItem은 코드 블록 안에서 제한적으로 사용되며 변경할 수 없다.
    val numbers4 = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers4.first().let { firstItem ->
        println("The first item of the list is '$firstItem'")
        // firstItem = 'test' : 불가능
        if (firstItem.length >= 5) firstItem else "!$firstItem!"
    }.uppercase(Locale.getDefault())
    println("First item after modifications: '$modifiedFirstItem'")

    println("")


    // with
    // with는 람다 결과를 제공하지 않고 객체의 컨텍스트 안에서 함수를 호출하는 경우 사용한다. 주의할 점은 non-null인 객체만 사용 가능하다.
    println("with test")
    val numbers5 = mutableListOf("one", "two", "three")
    with(numbers5) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
        println("${this[0]}, ${this[1]}, ${this[2]}")
    }
    val numbers = mutableListOf("one", "two", "three")
    val firstAndLast = with(numbers) {
        println("numbers size : ${numbers.size}")
        "The first element is ${first()}, the last element is ${last()}"
    }
    println(firstAndLast)

    println("")


    // run
    // apply와 비슷하지만 이미 생성된 객체에 대한 call chain으로 호출한다는 점이 다르다.
    // run은 람다 함수 안에 객체 초기화와 return 값의 계산이 포함될때 유용하게 사용할 수 있다.
    println("run test")
    val service = MultiportService("https://example.kotlinlang.org", 80)

    val result = service.run {
        port = 8080
        query(prepareRequest() + " to port $port")
    }
    // the same code written with let() function:
    val letResult = service.let {
        it.port = 8080
        it.query(it.prepareRequest() + " to port ${it.port}")
    }

    val hexNumberRegex = run {
        val digits = "0-9"
        val hexDigits = "A-Fa-f"
        val sign = "+-"

        Regex("[$sign]?[$digits$hexDigits]+")
    }

    for (match in hexNumberRegex.findAll("+1234 -FFFF not-a-number")) {
        println(match.value)
    }

    println("")

}

class MultiportService(var url: String, var port: Int) {

    fun query(text: String) {
        println(text)
    }

    fun prepareRequest() : String {
        return url
    }

}

class Person(var name: String) {
    var age: Int = 0
    var city: String = ""
}

fun processNonNullString(text: String) {
    println("text : $text")
}
