package base

// 추상클래스 선언 : abstract
abstract class AbstractAnimal {
    // 추상메소드 선언
    abstract fun eat()

    // 일반함수
    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : AbstractAnimal() {
    override fun eat() {
        println("당근을 먹습니다")
    }
}

// 수퍼클래스에서는 함수의 구체적인 구현은 없고
// 단지 Animal의 모든 서브클래스는 eat이라는 함수가 '반드시 있어야 한다'는 점만 명시하여
// 각 서브클래스가 비어있는 함수의 내용을 필요에 따라 구현하도록 하려면 추상화 (abstract) 개념 사용

// 추상화 : 선언부만 있고 기능이 구현되지 않은 추상함수, 추상함수를 포함하는 추상클래스 요소로 구성
// 비어있는 껍데기 라고 생각하면 쉬움

// abstract를 붙이 추상클래스는 일부함수가 구현되지 않은 미완성 클래스이기 때문에
// 단독으로는 인스턴스를 생성할 수 없음
// 반드시 서브클래스에서 상속받아서 abstract 표시가 된 함수들을 구현해줘야함

// 다른언어에서의 interface : 추상함수로만 이루어져 있는 '순수 추상화 기능'을 말하는것
// 코틀린에서의 interface : 속성, 추상함수, 일반함수 모두 가질수 있음
// 다만, 추상함수는 생성자를 가질 수 있는 반면 인터페이스는 생성자를 가질수 없음
// 인터페이스에서는
// 구현부가 있는 함수 -> open 함수로 간주
// 구현부가 없는 함수 -> abstract 함수로 간주 하기때문에
// 별도의 키워드(open, abstract) 가 없어도 포함된 모든 함수를 서브클래스에서 구현 및 재정의가 가능
// 한번에 여러 인터페이스를 상속받을 수 있음
