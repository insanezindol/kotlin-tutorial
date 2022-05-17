package ext

// observer pattern : 이벤트가 일어나는 것을 감시하는 감시자 역할을 만든다
// 1. 이벤트를 수신하는 클래스
// 2. 이벤트의 발생 및 전달을 하는 클래스
// 이 두개의 클래스 사이에 interface = listener 를 생성 callback

fun main() {

    println("익명객체와 옵저버 패턴")
    EventPrinter1().start()
    EventPrinter2().start()

}

interface EventListener {
    fun onEvent(count: Int)
}

class CounterWorker(var listener: EventListener) {

    fun count() {
        for(i in 1..100) {
            if(i % 5 == 0)
                listener.onEvent(i)
        }
    }

}

// 인터페이스를 상속받아서 구현
class EventPrinter1: EventListener {

    override fun onEvent(count: Int) {
        print("${count}-")
    }

    fun start() {
        val counterWorker = CounterWorker(this)
        counterWorker.count()
    }

}

// 익명객체로 구현
class EventPrinter2 {
    fun start() {
        val counterWorker = CounterWorker(object : EventListener {
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counterWorker.count()
    }
}