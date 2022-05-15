package Chapter1

fun main() {

    println("클래스의 생성자")

    var a = Person ("박보영", 1990)
    var b = Person ("전정국", 1997)
    var c = Person ("장원영", 2004)

    println()

    // 기본생성자 : 클래스를 만들때 기본으로 선언
    // 보조생성자 : 필요에 따라 추가적으로 선언
    var d = Person("이루다")
    var e = Person("차은우")
    var f = Person("류수정")

}
