package ext

// 고차함수 : 함수를 마치 클래스에서 만들어 낸 '인스턴스처럼' 취급하는 방법
// 함수를 파라미터로 넘겨 줄 수도 있고 결과값으로 반환 받을수도 있는 방법

fun main() {
    // 일반 함수를 고차 함수로 변경해 주는 연산자 콜론 두개(::)
    testB(::testA)
    // 1) main 함수가 testA함수를 파라미터로 testB에게 넘기고
    // 2) testB는 전달받은 함수(testA)를 호출함
    // 3) 최종적으로 testA 함수가 호출되어 println 을 실행함

    // 변수 a 는 Int 형이다.
    val a: Int
    // 변수 c 는 함수 형이다.
    val testC: (String) -> Unit = { str -> println("$str 람다함수") }
    testB(testC)

    // 타입추론 + 여러구문을 사용가능
    val testD = { str: String ->
        println("$str 람다함수")
        println("여러 구문을")
        println("사용가능합니다.")
    }
    testB(testD)

    // 여러줄인 경우 마지막 구문이 반환함
    val testE: (Int, Int) -> Int = { a, b ->
        println(a)
        println(b)
        // 마지막 구문인 a+b의 값을 Int로 반환함
        a+b
    }

    // 파라미터가 없는 람다함수
    val testF: () -> Unit = { println("파라미터가 없어요") }

    // 파라미터가 하나뿐이라면 it 사용
    val testG: (String) -> Unit = { println("$it 람다함수") }

}

fun testA (str : String) {
    println("$str 함수 testA")
}

// (자료형, 자료형, ...) -> 자료형
// 파라미터 -> 반환형
// 반환형에는 값이 없다 : Unit
fun testB (function: (String) -> Unit) {
    function("testB가 호출한")
}
