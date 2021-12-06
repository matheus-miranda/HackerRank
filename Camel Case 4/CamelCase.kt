import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    while (sc.hasNextLine()) {
        val input = sc.nextLine()

        if (input.first() == 'S') {
            when {
                input[2] == 'M' -> {
                    println(
                        input.drop(4).dropLast(2).split("""(?=[A-Z])""".toRegex()).joinToString(" ")
                            .toLowerCase()
                    )
                }
                input[2] == 'C' -> {
                    println(
                        input.drop(4).split("""(?=[A-Z])""".toRegex()).joinToString(" ")
                            .toLowerCase()
                            .trimStart()
                    )
                }
                input[2] == 'V' -> {
                    println(
                        input.drop(4).split("""(?=[A-Z])""".toRegex()).joinToString(" ")
                            .toLowerCase()
                    )
                }
            }
        } else if (input.first() == 'C') {
            when {
                input[2] == 'C' -> {
                    val sb = StringBuilder()
                    input.drop(4).split(" ").forEach { word ->
                        sb.append(word[0].toUpperCase())
                        sb.append(word.subSequence(1, word.length))
                    }
                    println(sb.toString())
                }
                input[2] == 'M' -> {
                    val sb = StringBuilder()
                    input.drop(4).split(" ").forEach { word ->
                        sb.append(word[0].toUpperCase())
                        sb.append(word.subSequence(1, word.length))
                    }
                    sb.append("()")
                    val result =
                        sb.toString()[0].toLowerCase() + sb.subSequence(1, sb.length).toString()
                    println(result)
                }
                input[2] == 'V' -> {
                    val sb = StringBuilder()
                    input.drop(4).split(" ").forEach { word ->
                        sb.append(word[0].toUpperCase())
                        sb.append(word.subSequence(1, word.length))
                    }
                    val result =
                        sb.toString()[0].toLowerCase() + sb.subSequence(1, sb.length).toString()
                    println(result)
                }
            }
        }
    }
}