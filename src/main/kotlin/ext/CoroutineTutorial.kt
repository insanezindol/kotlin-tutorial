package ext

import kotlinx.coroutines.*

fun main() {
    test1()
    test2()
    test3()
    test4()
    test5()
}

fun test1() {
    val scope = GlobalScope
    scope.launch {
        for (i in 1..5) {
            println(i)
        }
    }
}

fun test2() {
    // 코루틴이 완료될때까지 메인루틴을 기다려줌
    runBlocking {
        launch {
            for (i in 1..5) {
                println(i)
            }
        }
    }
}

fun test3() {
    runBlocking {
        var a = launch {
            for (i in 1..5) {
                println(i)
                delay(10)
            }
        }

        val b = async {
            "async 종료"
        }
        println("async 대기")
        println(b.await())

        println("launch 대기")
        a.join()
        println("launch 종료")
    }
}

fun test4() {
    runBlocking {
        var a = launch {
            for (i in 1..5) {
                println(i)
                delay(10)
            }
        }

        val b = async {
            "async 종료"
        }
        println("async 대기")
        println(b.await())

        println("launch 취소")
        a.cancel()
        println("launch 종료")
    }
}

fun test5() {
    runBlocking {
        var result = withTimeoutOrNull(50) {
            for (i in 1..10) {
                println(i)
                delay(10)
            }
            "Finish"
        }
        println(result)
    }
}