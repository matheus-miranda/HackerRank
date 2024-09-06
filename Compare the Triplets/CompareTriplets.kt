fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val result = intArrayOf(0, 0)

    for (i in 0 until a.size) {
        if (a[i] > b[i]) result[0]++
        else if (a[i] < b[i]) result[1]++
    }

    return result.toTypedArray()
}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
