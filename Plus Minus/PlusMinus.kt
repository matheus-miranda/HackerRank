fun plusMinus(arr: Array<Int>): Unit {
    var positiveNumbers = 0.0
    var negativeNumbers = 0.0
    var zeros = 0.0
    val size = arr.size

    for (element in arr) {
        when {
            element > 0 -> {
                positiveNumbers++
            }
            element < 0 -> {
                negativeNumbers++
            }
            else -> {
                zeros++
            }
        }
    }
    println(String.format("%.6f", positiveNumbers / size))
    println(String.format("%.6f", negativeNumbers / size))
    println(String.format("%.6f", zeros / size))
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)
}