fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    val result = arrayListOf<Int>()

    for (i in queries.indices) {
        var counter = 0
        strings.forEach {
            if (queries[i] == it) {
                counter++
            }
        }
        result.add(i, counter)
    }

    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val stringsCount = readLine()!!.trim().toInt()

    val strings = Array<String>(stringsCount, { "" })
    for (i in 0 until stringsCount) {
        val stringsItem = readLine()!!
        strings[i] = stringsItem
    }

    val queriesCount = readLine()!!.trim().toInt()

    val queries = Array<String>(queriesCount, { "" })
    for (i in 0 until queriesCount) {
        val queriesItem = readLine()!!
        queries[i] = queriesItem
    }

    val res = matchingStrings(strings, queries)

    println(res.joinToString("\n"))
}