package ext

// as : 변수를 호환되는 자료형으로 변환해주는 캐스팅 연산자
// var a: Drink = Cola()
// a as Cola
// 이후 a는 Cola로 동작함
// var b = a as Cola
// Cola로 변환한 결과를 반환받아 변수에 넣을수도 있음

// is : 변수가 자료형에 호환되는지를 먼저 체크한 후 변환해주는 캐스팅 연산자
// var a: Drink = Cola()
// if(a is Cola) {
//    이안에서만 a가 Cola가 됨
// }

fun main() {
    println("클래스의 다형성")

    var a = Drink()
    a.drink()
    // 음료를 마십니다
    println("a is ${a.javaClass}")

    var b : Drink = Cola()
    b.drink()
    // 음료중에 콜라를 마십니다
    // b는 Drink 변수 이기때문에
    // 호출 불가 b.washDishes() : Unresolved references
    println("b is ${b.javaClass}")

    // is는 조건문 안에서 잠시 다운캐스팅 된다
   if (b is Cola) {
        b.washDishes()
       // 콜라로 설거지를 합니다
    }

    var c = b as Cola
    c.washDishes()
    // 콜라로 설거지를 합니다
    println("c is ${c.javaClass}")

    // 37번 라인으로 인해 c 뿐만아니라 b도 다운캐스팅이 됨
    b.washDishes()

    println("a is ${a.javaClass}")
    println("b is ${b.javaClass}")
    println("c is ${c.javaClass}")

}

open class Drink {
    var name = "음료"

    open fun drink () {
        println("${name}를 마십니다")
    }
}

class Cola: Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}를 마십니다")
    }

    fun washDishes() {
        println("${type}로 설거지를 합니다")
   }

}

