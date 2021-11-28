fun plusMinus(arr: Array<Int>): Unit {
    var positiveNumbers = 0.0
    var negativeNumbers = 0.0
    var zeroCount = 0.0

    for (i in arr.indices) {
        when {
            arr[i] > 0 -> positiveNumbers++
            arr[i] < 0 -> negativeNumbers++
            else -> zeroCount++
        }
    }

    println(String.format("%.6f", positiveNumbers / arr.size))
    println(String.format("%.6f", negativeNumbers / arr.size))
    println(String.format("%.6f", zeroCount / arr.size))
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)
}
