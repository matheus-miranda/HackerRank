fun breakingRecords(scores: Array<Int>): Array<Int> {
    var maxScore = scores.first()
    var minScore = scores.first()
    var minRecordsBroken = 0
    var maxRecordsBroken = 0

    scores.drop(1).forEach { score ->
        if (score > maxScore) {
            maxScore = score
            maxRecordsBroken++
        }
        if (score < minScore) {
            minScore = score
            minRecordsBroken++
        }
    }
    return arrayOf(maxRecordsBroken, minRecordsBroken)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val scores = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    val result = breakingRecords(scores)
    println(result.joinToString(" "))
}