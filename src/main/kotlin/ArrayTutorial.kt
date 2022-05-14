fun main() {

    println("형변환과 배열")

    // 형변환 함수
    /*
     * toByte()
     * toShort()
     * toInt()
     * toLong()
     * toFloat()
     * toDouble()
     * toChar()
     */

    // Int to Long : 명시적 형변환
    // kotlin은 암시적 형변환 지원안함
    val a: Int = 54321
    val b: Long = a.toLong()
    println("a : $a , b : $b")

    // 배열 선언 : 처음 선언했을때의 전체크기를 변경할 수 없음
    val intArr = arrayOf(1, 2, 3, 4, 5)
    // 5개의 Int를 저장할수 있는 배열 선언 null로 채워짐 <제네릭>
    val nullArr = arrayOfNulls<Int>(5)
    println("intArr : " + intArr[0] + "," + intArr[1] + "," + intArr[2] + "," + intArr[3] + "," + intArr[4])
    println("nullArr : " + nullArr[0] + "," + nullArr[1] + "," + nullArr[2] + "," + nullArr[3] + "," + nullArr[4])

    // 배열에 값할당
    intArr[2] = 8
    println("intArr : " + intArr[0] + "," + intArr[1] + "," + intArr[2] + "," + intArr[3] + "," + intArr[4])

}