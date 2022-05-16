package ext

fun main() {

    var a = FoodPollTutorial("짜장")
    var b = FoodPollTutorial("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("합계 : ${FoodPollTutorial.total}")

}

class FoodPollTutorial (val name: String) {

    // static member 같은 개념
    // 다른 인스턴스라도 total은 공유하고 있음
    companion object {
        var total = 0
    }
    var count = 0

    fun vote() {
        total++
        count++
    }

}