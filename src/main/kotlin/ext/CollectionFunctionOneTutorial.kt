package ext

fun main() {

    val nameList = listOf("박수영", "김지수", "김다현", "신유나", "김지우")

    // 차례로 반복
    nameList.forEach { print("$it ") }
    println()

    // 김씨성을 가진 사람만 filter한 리스트를 반환
    var filterList = nameList.filter { it.startsWith("김") }
    println(filterList)

    // 기존 리스트에 '이름 : ' 을 붙인 리스트를 반환
    var mapList = nameList.map { "이름 : $it" }
    println(mapList)

    // '김지연'이라는 이름을 가진 사람이 하나라도 있는지 검사
    println(nameList.any { it == "김지연" })

    // 이름이 모두 세글자인지 검사
    println(nameList.all { it.length == 3 })

    // 이씨 성을 가진사람이 하나도 없는지 검사
    println(nameList.none { it.startsWith("이") })

    // 김씨성을 가진 첫번째 사람을 반환
    println(nameList.first { it.startsWith("김") })

    // 김씨성을 가진 마지막 사람을 반환
    println(nameList.last { it.startsWith("김") })

    // 이름에 '지'가 들어가는 사람의 숫자
    println(nameList.count { it.contains("지") })

}