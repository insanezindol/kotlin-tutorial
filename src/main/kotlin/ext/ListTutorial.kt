package ext

fun main() {

    println("리스트")
    val a = listOf("사과", "딸기", "배")
    println(a[1])

    for(fruit in a) {
        print("${fruit}:")
    }
    println()

    val b = mutableListOf(6, 3, 1)
    println(b)
    // [6, 3, 1]

    b.add(4)
    println(b)
    // [6, 3, 1, 4]

    b.add(2, 8)
    println(b)
    // [6, 3, 8, 1, 4]

    b.removeAt(1)
    println(b)
    // [6, 8, 1, 4]

    b.shuffle()
    println(b)
    // 랜덤하게 나옴

    b.sort()
    println(b)
    // [1, 4, 6, 8]

}

// 리스트 란?
// 데이터를 모아 관리하는 컬렉션 Collection -> List, Set, Map

// 리스트의 종류
// List<out T> : 생성시에 넣은 객체를 대체, 추가, 삭제 할 수 없음
// MutableList<T> : 생성시에 넣은 객체를 대체, 추가, 삭제 가능함
// *** mutable : 변할수 있는

// 리스트를 만드는 방법
// listOf(1, 2, 3)
// mutableListOf("A", "B", "C")

// MutableList에서 제공되는 함수
// 요소의 추가 : add(데이터) , add(인덱스, 데이터)
// 요소의 삭제 : remove(데이터) , removeAt(인덱스)
// 무작위 섞기 : shuffle()
// 정렬 : sort()
// list[인덱스] = 데이터