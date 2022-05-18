package ext

fun main() {
    println("중첩클래스와 내부클래스")

    // 중첩클래스 : Nested Class
    // 형태만 내부에 존재할뿐 외부클래스의 내용을 공유할 수 없음
    // 내부클래스 : Inner Class
    // 혼자서 객체를 만들수 없고, 외부 클래스의 객체가 있어야만 생성과 사용이 가능
    // 외부 클래스의 속성과 함수를 사용할 수 있음

    Outer.Nested().introduce()

    val outer = Outer()
    val inner = outer.Inner()
    inner.introduceInner()
    inner.introduceOuter()

    inner.text = "Changed Inner Class"
    outer.text = "Changed Outer Class"

    inner.introduceInner()
    inner.introduceOuter()

}

class Outer {
    var text = "Outer Class"

    class Nested {
        fun introduce() {
            println("Nested Class")
        }
    }

    inner class Inner {
        var text = "Inner Class"
        fun introduceInner() {
            println(text)
        }

        fun introduceOuter() {
            println(this@Outer.text)
        }
    }
}