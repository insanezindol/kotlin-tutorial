package ext

fun main() {

    val a = LateInitSample()
    println(a.getLateInitText())

    a.text = "초기화!"
    println(a.getLateInitText())

    println()

    val number: Int by lazy {
        println("초기화를 합니다.")
        7
    }

    println("코드를 시작합니다.")
    println(number)
    println(number)

}


class LateInitSample {

    lateinit var text: String

    fun getLateInitText(): String {
        if (::text.isInitialized) {
            return text
        } else {
            return "기본값"
        }
    }

}