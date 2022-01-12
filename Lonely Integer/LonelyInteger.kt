fun lonelyinteger(a: Array<Int>) = a.filter { element -> a.count { it == element } == 1 }.first()

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = lonelyinteger(a)

    println(result)
}
