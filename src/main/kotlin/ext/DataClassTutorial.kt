package ext

fun main() {

    val a = General("보영", 212)

    println(a == General("보영", 212))
    println(a.hashCode())
    println(a.toString())

    val b = Data("루다", 306)
    println(b == Data("루다", 306))
    println(b.hashCode())
    println(b.toString())

    println(b.copy())
    println(b.copy("아린"))
    println(b.copy(id = 618))


    val list = listOf(Data("보영", 212),
        Data("루다", 306),
        Data("아린", 618))

    for(a in list) {
        println("test1 : ${a.id} , ${a.name}")
    }

    for((a, b) in list) {
        println("test2 : $a , $b")
    }

}

class General(val name: String, val id: Int)

data class Data(val name: String, val id: Int)