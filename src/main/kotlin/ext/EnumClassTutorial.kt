package ext


fun main() {

    println("Enum Class")
    // enum은 선언시에 만든 객체를 이름으로 참조하여 그대로 사용
    var state = State.SING
    println(state);
    // SING

    state = State.SLEEP
    println(state.isSleeping());
    // true

    state = State.EAT
    println(state.message);
    // 밥을 먹습니다

}

enum class State (val message: String) {
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다.");

    fun isSleeping() = this == SLEEP
}