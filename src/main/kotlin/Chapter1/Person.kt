package Chapter1

// 함수없이 속성만으로 이루어진 클래스
class Person (var name:String, val birthYear:Int) {

    // init 함수 : 파라미터나 반환형이 없는 특수한 함수
    // 생성자를 통해 인스턴스가 만들어질때 호출되는 함수
    // this는 인스턴스 자신의 속성이나 함수를 호출하기 위해 클래스 내부에서 사용되는 키워드
    init {
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }

    // 기본생성자 : 클래스를 만들때 기본으로 선언
    // 보조생성자 : 필요에 따라 추가적으로 선언
    constructor(name:String) : this(name, 1997) {
        println("보조 생성자가 사용되었습니다.")
    }

    fun introduce () {
        println("안녕하세요, ${this.birthYear}년생 ${this.name}입니다.")
    }

}