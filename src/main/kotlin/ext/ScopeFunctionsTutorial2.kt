package ext

fun main() {

    // [apply] as-is
    var a = Book("코틀린 서적", 10000)
    println("${a.name}, ${a.price}")

    a.name = "[초특가]" + a.name
    a.discount()
    println("${a.name}, ${a.price}")

    val price : Int = 5000
    // 이변수가 아래 apply, run에 영향을 줌

    // [apply]
    var b = Book("코틀린 서적", 10000).apply {
        name = "[초특가]" + name
        discount()
    }

    // [run]
    a.run {
        println("[run] 상품명 : ${name}, 가격 : ${price}원")
    }

    // [with]
    with(a) {
        println("[with] 상품명 : ${name}, 가격 : ${price}원")
    }

    // [also]
    var c = Book("코틀린 서적", 10000).also {
        it.name = "[초특가]" + it.name
        it.discount()
    }

    // [let]
    c.let {
        println("[let] 상품명 : ${it.name}, 가격 : ${it.price}원")
    }


}

class Book (var name: String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}

// 스코프함수의 종류
// apply : 인스턴스를 생성한 후 변수에 담기전에 '초기화 과정'을 수행할때 주로 사용
// run : run 스코프 안에서 참조연산자를 사용하지 않아도 된다는 점은 apply와 동일하지만, 일반 람다함수처럼 인스턴스 대신 마지막 라인의 결과값을 반환함
// 이미 인스턴스가 만들어진 후에 인스턴스의 함수나 속성을 scope 내에서 사용해야 할때 사용
// with : run과 동일한 기능을 가지지만, 단지 인스턴스를 참조연산자 대신 파라미터로 받는다는 차이뿐
// also : (=apply) 처리가 끝나면 인스턴스를 반환(참조연산자 없이 접근가능) <-> it을 통해 접근가능
// let : (=run) 처리가 끝나면 최종값을 반환(참조연산자 없이 접근가능) <-> it을 통해 접근가능