package base

fun main() {

    println("반복문과 증감연산자")

    // 조건형 반복문 : 조건이 참인 경우 반복을 유지
    // while, do-while
    // 범위형 반복문 : 반복 범위를 정해 반복을 수행

    var a = 0
    while (a < 5) {
        println("a : " + a++)
    }
    // 0, 1, 2, 3, 4

    var b = 0
    while (b < 5) {
        println("b : " + ++b)
    }
    // 1, 2, 3, 4, 5

    // 증감연산자
    // 증가연산자 : ++a, a++ : 1증가
    // 감소연산자 : --a, a-- : 1감소
    // 앞에 부호 : prefix operators : 전위연산자 : 연산자가 포함된 구문에서 이미 증감된 수를 반영하여 연산이 진행
    // 뒤에 부호 : postfix operators : 후위연산자 : 다음 구문부터 사용

    var c=0
    do {
        println("c : " + c++)
    } while (c<5)
    // 0, 1, 2, 3, 4

    var d=0
    do {
        println("d : " + ++d)
    } while (d<5)
    // 1, 2, 3, 4, 5

    // 반복문
    // 변수 i는 0부터 9까지 1씩 증가하면서 반복
    for(i in 0..9){
        print("$i ")
    }
    // 0 1 2 3 4 5 6 7 8 9
    println()

    for(i in 0..9 step 3) {
        print("$i ")
    }
    // 0 3 6 9
    println()

    for(i in 9 downTo 0) {
        print("$i ")
    }
    // 9 8 7 6 5 4 3 2 1 0
    println()

    for(i in 9 downTo 0 step 3) {
        print("$i ")
    }
    // 9 6 3 0
    println()

    for(i in 'a'..'e'){
        print("$i ")
    }
    // a b c d e
    println()

}
