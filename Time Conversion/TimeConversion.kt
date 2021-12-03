fun timeConversion(s: String): String {
    val formattedTime: String = if (s.contains("AM", true)) {
        if (s.startsWith("12", true)) {
            "00" + s.drop(2).dropLast(2)
        } else {
            s.dropLast(2)
        }
    } else {
        if (s.startsWith("12", true)) {
            s.dropLast(2)
        } else {
            val timeToConvert = s.take(2).toInt()
            (timeToConvert + 12).toString() + s.drop(2).dropLast(2)
        }
    }
    return formattedTime
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}