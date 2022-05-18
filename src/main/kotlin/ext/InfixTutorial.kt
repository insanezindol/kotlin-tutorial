package ext

fun main() {

    println(pair)
    println(map1)
    println(map2)

    // this multiply x
    println(6 multiply 4)
    println(6.multiply(4))

    // this add other
    val str = "Hello" add "World"
    println(str)

    // class 에서 infix
    val myString = MyString()
    myString add "Hello"
    myString add "World"
    myString add "Kotlin"
    println(myString.string)
}

// Infix 함수는 두개의 변수 가운데 오는 함수를 말합니다.
// 코틀린에서 기본적으로 정의된 Infix 함수들 중에 Pair를 만드는 to가 있습니다.
val pair : Pair<String, String> = "White" to "0xffffff"

// 아래 코드는 코틀린에서 Map을 만들 때 자주 사용하는 패턴입니다.
// 하나는 Pair를 이용하였고, 하나는 Infix 함수를 이용하였습니다.
val map1 = mapOf(Pair("key1", "value1"), Pair("key2", "value2"))
val map2 = mapOf("key1" to "value1", "key2" to "value2")


// Infix 함수는 직접 정의할 수도 있습니다.
// infix fun 자료형.함수이름(파리미터: 자료형): 리턴타입 { 구현부 }
// 같은 형식으로 정의할 수 있습니다.

infix fun Int.multiply(x: Int): Int = this * x

infix fun String.add(other:String): String {
    return this + other
}

// 아래 코드는 클래스 내에 Infix 함수를 정의한 예제입니다.
// 클래스 내에 정의하면 dispatcher가 클래스 자신이기 때문에 생략할 수 있습니다.
class MyString {
    var string = ""
    infix fun add(other: String) {
        this.string = this.string + other
    }
}

// Infix 함수에 대해서 알아보았습니다.
// 적절한 Infix 함수의 사용은 코드를 간결하게 만들고 가독성을 높혀준다는 장점이 있습니다.
