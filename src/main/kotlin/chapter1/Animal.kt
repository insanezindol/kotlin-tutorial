package chapter1

// 코틀린은 상속 금지가 기본값이고, open 상태여야지만 상속이 가능하다.
open class Animal (var name:String, var age:Int, var type:String) {
    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }

}

// 상속의 2가지 필수조건
// 서브 클래스는 수퍼 클래스에 존재하는 속성과 '같은 이름'의 속성을 가질 수 없음
// 서브 클래스가 생성될때는 반드시 수퍼 클래스의 생성자까지 호출되어야 함

// var, val등을 붙이면 속성으로 선언되고
// 붙이지 않으면 파라미터로 인식
class Dog (name: String, age: Int) : Animal(name, age, "개") {
    fun bark() {
        println("멍멍")
    }
}

class Cat (name: String, age: Int) : Animal(name, age, "고양이") {
    fun meow() {
        println("야옹")
    }
}
