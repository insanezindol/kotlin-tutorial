package Chapter2

// Animal 클래스를 상속 가능하게 open 키워드를 사용
open class Animal {
    // Animal 클래스를 상속받은 서브클래스에서 재구현 가능하도록 open 키워드를 사용
    open fun eat() {
        println("음식을 먹습니다")
    }
}

// Animal 클래스를 상속받음
class Tiger : Animal() {
    // override 키워드를 사용하여 슈퍼클래스의 eat 함수를 재구현
    override fun eat() {
        println("고기를 먹습니다")
    }
}

// 슈퍼클래스 open 함수 -> 서브클래스 override 함수 재구현