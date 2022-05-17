package ext

// 내용의 동일성 : 메모리상에 다른 주소에 있어도 내용이 같은것 : a == b
// 객체의 동일성 : 다른 변수가 메모리상에 같은 주소를 할당하고 있는것 : a === b

fun main() {

    println("동일한지를 확인하는 방법")
    var a = Product("콜라", 1000)
    var b = Product("콜라", 1000)
    var c = a
    var d = Product("사이다", 1000)

    println(a == b) // true : 내용 같음
    println(a === b) // false : 객체 다름 (다른 메모리 주소)

    println(a == c) // true : 내용 같음
    println(a === c) // true : 객체 같음 (같은 메모리 주소)

    println(a == d) // false : 내용 다름
    println(a === d) // false : 객체 다름 (다른 메모리 주소)

}

class Product(val name: String, val price: Int) {

    override fun equals(other: Any?): Boolean {
        if(other is Product) {
            return other.name == this.name && other.price == this.price
        } else {
            return false
        }
    }

}