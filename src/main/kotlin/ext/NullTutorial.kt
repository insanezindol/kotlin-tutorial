package ext

fun main() {

    println("null 값을 처리하는 방법")

    // null 선언
    var a: String? = null

    // 널 세이프 연산자 : 변수의 내용이 null이기 때문에, uppercase 미실행
    println(a?.uppercase())
    // null

    // 엘비스 연산자자 : null 대신 default 라는 문자열로 대체된뒤 uppercase 실행
    println(a?:"default".uppercase())
    // DEFAULT

    // 넌널어썰션 연산자 : 구문이 실행되는 도중 null임을 확인하고 NullPointerException
    // println(a!!.uppercase())
    // 에러가 나고 프로그램이 중단됨

    a?.run{
        println(uppercase())
        println(lowercase())
    }

    var b = "Kotlin Exam"
    b?.run{
        println(uppercase())
        println(lowercase())
    }

}

// ?. null safe operator
// > 참조연산자를 실행하기 전에 먼저 객체가 null인지 확인부터하고
// 객체가 null이라면 뒤따라오는 구문을 실행하지 않는다.

// ?: elvis operator
// 객체가 null이 아니라면 그대로 사용하지만 null이라면
// 연산자 우측의 객체로 대체되는 연산자

// !!. non-null assertion operator
// 참조연산자를 사용할때 null 여부를 컴파일시 확인하지 않도록하여
// 런타임시 null pointer exceptio 이 나도록 의도적으로 방치하는 연산자