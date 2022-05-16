package chapter1

fun main() {

    println("클래스의 기본 구조")

    var a = Person ("박보영", 1990)
    var b = Person ("전정국", 1997)
    var c = Person ("장원영", 2004)

    // 클래스에 속성 접근하여 출력
    println("안녕하세요, ${a.birthYear}년생 ${a.name}입니다.")

    // 자기소개 함수 호출
    a.introduce()
    b.introduce()
    c.introduce()

}
