package base

fun main() {

    println("조건문과 비교연산자")
    
    var a = 7
    
    if (a > 10) {
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작거나 같다")
    }

    // 부등호
    // <, <=, >, >=, !=
    // 작다, 작거나같다, 크다, 크거나같다, 같지않다
    // 등호
    // == : 같다
    // is 연산자 : 자료형이 맞는지 체크
    // !is 연산자 : 자료형이 틀린지 체크

    // 좌측변수가 우측 자료형에 호환되는지 여부를 체크하고
    // 형변환까지 한번에 진행시켜줌
    if(a is Int){
        println("a는 Int 에 호환")
    } else {
        println("a는 Int 에 미호환")
    }

    // 다중 조건문 When = 다른 언어의 switch 문과 동일한 기능
    doWhen(1)
    doWhen("DEAN")
    doWhen(12L)
    doWhen(3.14159)
    doWhen("Kotlin")

    var msg1 = doWhenAndReturn(1)
    var msg2 = doWhenAndReturn("DEAN")
    var msg3 = doWhenAndReturn(12L)
    var msg4 = doWhenAndReturn(3.14159)
    var msg5 = doWhenAndReturn("Kotlin")

    println("msg1 : $msg1")
    println("msg2 : $msg2")
    println("msg3 : $msg3")
    println("msg4 : $msg4")
    println("msg5 : $msg5")

}

// 파라미터로 넘어온 Any 라는 자료형 : 어떤 자료형이든 상관없이 호환되는 코틀린의 최상위 자료형
fun doWhen (a: Any) {
    // 여러개의 조건이 만족하더라도 먼저 부합하는 조건이 실행됨
    when(a) {
        1 -> println("정수 1입니다.")
        "DEAN" -> println("코틀린 튜토리얼입니다.")
        is Long -> println("Long 타입 입니다.")
        !is String -> println("String 타입이 아닙니다.")
        else -> println("어떤 조건도 만족하지 않습니다.")
    }
}

// 동작대신 값을 반환하는 표현식으로서의 역할을 하는 함수
fun doWhenAndReturn (a: Any): String {
    // 여러개의 조건이 만족하더라도 먼저 부합하는 조건이 실행됨
    var result = when(a) {
        1 -> "정수 1입니다."
        "DEAN" -> "코틀린 튜토리얼입니다."
        is Long -> "Long 타입 입니다."
        !is String -> "String 타입이 아닙니다."
        else -> "어떤 조건도 만족하지 않습니다."
    }
    println("result : $result")
    return result
}
