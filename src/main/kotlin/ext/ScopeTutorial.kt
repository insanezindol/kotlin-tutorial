package ext

// 스코프 : 범위 (언어 차원에서 변수나 함수, 클래스 같은 '멤버'들을 서로 공유하여 사용할 수 있는 범위를 지정해 둔 단위
// 범위
// 1. 패키지
// 2. 클래스
// 3. 함수

val a = "패키지 스코프"

class B {
    fun print() {
        println(a)
    }
}

class C {
    var a = "클래스 스코프";
    fun print() {
        println(a)
    }
}

fun main() {
    var a = "함수 스코프";
    println(a)
    B().print()
    C().print()
}


// public
// internal
// private
// protected

// private var a = "..."
// public fun b {...}
// internal class C {...}

// 패키지 스코프에서는
// public(기본값) : 어떤 패키지에서도 접근 가능
// internal : 같은 모듈 내에서만 접근 가능
// private : 같은 파일 내에서만 접근 가능
// protected : 사용하지 않음

// 클래스 스코프에서는
// public(기본값) : 클래스 외부에서 늘 접근 가능
// internal : 사용하지 않음
// private : 클래스 내부에서만 접근 가능
// protected : 클래스 자신과 상속받은 클래스에서 접근가능

// 스코프는 멤버들의 가용 범위를 지정해 둔 단위 개발자는 의도에 따라 스코프 안에 변수나 함수, 클래스를 배치할수 있으며
// 접근제한자는 이러한 스코프의 외부와 내부에서 사용할 멤버를 분리하여 스코프 외부에서 건드리지 말아야할 기능이나 값들을 안전하게 제한하는 용도