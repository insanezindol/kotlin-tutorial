package chapter1

fun main() {

    println("흐름제어")

    // return
    // break
    // continue

    println("break test")
    for (i in 1..10) {
        if (i == 3) break
        println(i)
    }
    // 1, 2 까지만 출력

    println("continue test")
    for (i in 1..10) {
        if (i == 3) continue
        println(i)
    }
    // 3을 제외한 모든숫자가 출력

    // 코틀린의 특성 : 다중 반복문에서 label 사용
    // i == 1, j == 2 일때 다중반복문 종료하는 경우 기존 언어
    for (i in 1..10){
        for (j in 1..10){
            if(i == 1 && j == 2)
                break
        }
        // 또 체크 후 수동 종료
    }

    // 외부반복문에 '레이블 이름@' 형태로 선언후
    // break 문에서 '@레이블 이름' 을 달아주면
    // 레이블이 달린 반복문을 기분으로 즉시 break 시킴 (continue 도 마찬가지)
    testLoop@for (i in 1..10){
        for (j in 1..10){
            if(i == 1 && j == 2)
                break@testLoop
            println("i: $i, j: $j")
        }
        // 또 체크 후 수동 종료
    }

}
