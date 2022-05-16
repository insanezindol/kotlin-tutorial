package chapter1

fun main() {

    println("클래스의 상속")

    var a = Animal("별이", 5, "개")
    var b = Dog("별이", 5)

    a.introduce()
    b.introduce()
    b.bark()

    var c = Cat("루이", 1)
    c.introduce()
    c.meow()

}
