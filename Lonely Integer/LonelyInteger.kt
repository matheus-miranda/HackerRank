fun lonelyinteger(a: Array<Int>) =
    a.toList().groupingBy { it }.eachCount().filter { it.value < 2 }.keys.first()

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = lonelyinteger(a)

    println(result)
}