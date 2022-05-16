package chapter2

fun main() {

    var d = Dog()

    d.run()
    d.eat()

}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println ("음식을 먹습니다.")
    }
}

class Dog: Runner, Eater {
    override fun run() {
        println("우다다다 뜁니다")
    }
    override fun eat() {
        println("허겁지겁 먹습니다")
    }
}

// 오버라이딩 : 이미 구현이 끝난 함수의 기능을 서브클래스에서 변경해야할때
// 추상화 : 형식만 선언하고 실제 구현은 서브클래스에 일임할 때
// 인터페이스 : 서로 다른 기능들을 여러개 물려주어야 할 때
