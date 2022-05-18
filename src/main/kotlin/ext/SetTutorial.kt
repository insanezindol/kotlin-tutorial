package ext

fun main() {

    var fruit1 = setOf("살구", "사과", "복숭아")
    for (item in fruit1) {
        println(item)
    }
    // 불가
    // fruit1.add("자몽")

    var fruit2 = mutableSetOf("귤", "바나나", "키위")
    for (item in fruit2) {
        println(item)
    }

    fruit2.add("자몽")
    println(fruit2)
    // [귤, 바나나, 키위, 자몽]

    fruit2.remove("바나나")
    println(fruit2)
    // [귤, 키위, 자몽]

    println(fruit2.contains("귤"))
    // true

}