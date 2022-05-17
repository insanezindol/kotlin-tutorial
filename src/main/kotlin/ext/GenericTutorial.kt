package ext

fun main() {

    // 슈퍼클래스로 호환 : 성능 저하
    UsingGeneric1(SuperA()).doShouting()
    UsingGeneric1(ChildB()).doShouting()
    UsingGeneric1(ChildC()).doShouting()

    // 제너릭으로 타입을 판단 : 성능 향상
    UsingGeneric2(SuperA()).doShouting()
    UsingGeneric2(ChildB()).doShouting()
    UsingGeneric2(ChildC()).doShouting()

    // 캐스팅 없이 그대로 함수에서 사용
    doShouting(SuperA())
    doShouting(ChildB())
    doShouting(ChildC())

}

fun <T: SuperA> doShouting(t: T) {
    t.shout()
}

open class SuperA {
    open fun shout() {
        println("A가 소리칩니다")
    }
}

class ChildB : SuperA() {
    override fun shout() {
        println("B가 소리칩니다.")
    }
}

class ChildC : SuperA() {
    override fun shout() {
        println("C가 소리칩니다.")
    }
}

class UsingGeneric1 (val t: SuperA) {
    fun doShouting() {
        t.shout()
    }
}

class UsingGeneric2<T: SuperA> (val t: T) {
    fun doShouting() {
        t.shout()
    }
}