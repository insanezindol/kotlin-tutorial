package Chapter1

fun main() {

    println("변수와 자료형")

    // 한줄 주석

    /*
     * 주석 여러줄
     * 세미콜론 필요없음
     * 클래스 이름은 파스칼
     * 함수나 변수는 카멜
     */

    // var : 일반적으로 통용, 읽기/쓰기 가능
    // val : 선언시에만 초기화 가능, 중간에 변경 불가

    // 클래스에 선언된 변수 : Property (속성)
    // Scope 내에 선언된 변수 : Local Variable (로컬변수)

    // 코틀린은 기본변수에 null 허용하지 않음
    var a: Int = 123
    println("a : $a")

    var b: Int
    b = 456
    println("c : $b")

    // 자료형 뒤에 물음표를 붙이면 nullable 변수로 선언 가능
    var c: Int? = null
    println("c : $c")

    // 정수형 : Byte, Short, Int, Long
    // 실수형 : Float, Double
    // 8진수 표기 지원 안함
    // 10진수
    var intValue:Int = 1234
    var longValue:Long = 1234L
    // 16진수
    var intValueByHex:Int = 0x1af
    // 2진수
    var intValueByBin:Int = 0b10110110
    println("value : $intValue, $longValue, $intValueByHex, $intValueByBin")

    var doubleValue:Double = 123.5
    var doubleValueWithExp:Double = 123.5e10
    var floatValue:Float = 123.5f
    println("value : $doubleValue, $doubleValueWithExp, $floatValue")

    // 문자열 : UTF-16E
    // 문자열하나 2byte
    var charValue:Char = 'a'
    var koreanCharValue:Char = '가'

    println("char : $charValue, $koreanCharValue")

    /*
     * 특수문자 표기
     * \t : 탭
     * \b : 백스페이스
     * \r : 첫 열로 커서 옮김
     * \n : 개행
     * \' : 작은 따옴표
     * \" : 큰 따옴표
     * \\ : 역 슬래시
     * \$ : $문자
     * \uxxxx : 유니코드 문자
     */

    // boolean : true / false
    var booleanValue:Boolean = true
    println("boolean : $booleanValue")

    val stringValue = "one line string test"
    // 따옴표 세개 열고 닫으면 줄바꿈이나 특수문자까지 그대로 문자열로 사용 가능
    val multiLineStringValue = """multiline
        |string
        |test
    """.trimMargin()
    println("string 1 : $stringValue")
    println("string 2 : $multiLineStringValue")

}