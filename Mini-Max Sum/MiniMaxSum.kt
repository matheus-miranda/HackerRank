fun miniMaxSum(arr: Array<Int>) {
    val minSum = arr.sorted().dropLast(1).map { it.toLong() }.sum()
    val maxSum = arr.sorted().drop(1).map { it.toLong() }.sum()
    println("$minSum $maxSum")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
