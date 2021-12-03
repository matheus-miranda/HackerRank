fun timeConversion(s: String): String {
    return SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        .format(SimpleDateFormat("hh:mm:ssaa", Locale.getDefault()).parse(s))
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
