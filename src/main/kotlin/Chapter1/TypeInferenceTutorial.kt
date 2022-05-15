package Chapter1

fun main() {

    println("타입추론과 함수")

    var a = 1234
    // Int 형 변수로 지정

    var b = 1234L
    // Long 형 변수로 지정

    var c = 12.45
    // Double 형 변수로 지정

    var d = 12.45f
    // Float 형 변수로 지정

    var e = 0xABCD
    var f = 0b0101010
    // 16진수, 2진수 -> Int형으로 추론

    var g = true
    // Boolean 형 변수로 지정

    var h = 'c'
    // Char 형 변수로 지정

    // 반드시 특정한 자료형으로 지정해야하는 상황이 아니라면
    // 대부분은 코틀린의 타입추론 기능을 이용하여 코드량을 줄일수 있음

    println("result : $a, $b, $c, $d, $e, $f, $g, $h")
    
}