fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    for (i in grades.indices) {
        val modGrade = grades[i] % 5
        if (grades[i] > 37 && modGrade > 2) {
            grades[i] += 5 - modGrade
        }
    }
    return grades
}

fun main() {
    val gradesCount = readLine()!!.trim().toInt() // number of students

    val grades = Array<Int>(gradesCount) { 0 }
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}