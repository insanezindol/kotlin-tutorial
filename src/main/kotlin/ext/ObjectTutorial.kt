package ext

fun main() {

    println(Counter.count)

    Counter.countUp()
    Counter.countUp()
    println(Counter.count)

    Counter.clear()
    println(Counter.count)

}

// Singleton Pattern : 클래스의 인스턴스를 단 하나만 만들어 사용하도록 하는 코딩 아키텍쳐 패턴
// object 로 선언된 객체는 "최초 사용시" 자동으로 생성되며
// 이후에는 코드 전체에서 "공용으로 사용"될 수 있으므로
// 프로그램이 종료되기 전까지 공통적으로 사용할 내용들을 묶어 만드는것이 좋음
object Counter {
    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
}