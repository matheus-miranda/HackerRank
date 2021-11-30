fun miniMaxSum(arr: Array<Int>) {
    val sortedList = arr.sorted().map { it.toLong() }
    val minSum = sortedList.dropLast(1).sum()
    val maxSum = sortedList.drop(1).sum()
    println("$minSum $maxSum")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
