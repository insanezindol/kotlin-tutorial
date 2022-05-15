package Chapter1

fun main() {

    println("함수선언")

    println(add(5, 6, 7))
    println(addSingleExpressionFunction(5, 6, 7))

}

// fun 함수이름(매개변수1: 변수타입1, 매개변수2: 변수타입2 ...): 반환형타입 (없으면 생략가능)
fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

// 단일 표현식 함수 : 반환형을 타입추론 가능하므로 생락가능
fun addSingleExpressionFunction(a: Int, b: Int, c: Int) = a + b + c