package ext

fun main() {

    // 오버로딩
    read(7)
    read("감사합니다.")

    // 파라미터 생략하면 함수에 선언된 기본값으로 실행
    deliveryItem("짬뽐")
    deliveryItem("책", 3)
    deliveryItem("노트북", 30, "학교")

    // named arguments : 파라미터 순서와 상관없이 이름으로 전달
    deliveryItem("선물", destination = "친구집")

    // variable number of arguments (vararg)
    sum(1, 2, 3, 4)

}

fun read(x: Int) {
    println("숫자 $x 입니다.")
}

fun read(x: String) {
    println(x)
}

fun deliveryItem(name: String, count: Int = 1, destination: String = "집") {
    println("${name}, ${count}개를 ${destination}에 배달하였습니다")
}

// vararg : 개수가 지정되지 않은 파라미터라는 특징이 있음
// 다른 파라미터랑 같이쓸때는 제일 마지막에 위치해야함
fun sum(vararg numbers: Int) {
    var sum = 0

    for(n in numbers){
        sum += n
    }

    println(sum)
}