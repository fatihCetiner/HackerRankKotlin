package DiagonalDifference

import kotlin.math.abs


val arr = arrayOf(
    arrayOf(1, 2, 3),
    arrayOf(4, 5, 6),
    arrayOf(9, 8, 9)
)

fun main() {
    val result = diagonalDifference(arr)
    println(result)
}

// First Solution

fun diagonalDifference(a: Array<Array<Int>>): Int {

    val n = a.size

    // 1. Calculate primary diagonal (d1)
    // n = 3 -> a[0][0] + a[1][1] + a[2][2]

    var d1 = 0
    for (i in 0 until n) {
        d1 += a[i][i]
    }

    // 2. Calculate secondary diagonal (d2)
    // n = 3 -> a[0][2] + a[1][1] + a[2][0]

    var d2 = 0
    for (i in 0 until n) {
        d2 += a[i][n - i - 1]
    }

    // 3. Calculate and return |d1-d2|

    return abs(d1 - d2)

}

// Second Solution

fun diagonalDifference2(a: Array<Array<Int>>): Int {

    val n = a.size

    // 1. Calculate primary diagonal (d1)
    val d1 = (0 until n).sumOf { a[it][it] }

    // 2. Calculate secondary diagonal (d2)
    val d2 = (0 until n).sumOf { a[it][n - it - 1] }

    // 3. Calculate and return |d1-d2|
    return abs(d1 - d2)
}

// Third Solution

fun diagonalDifference3(a: Array<Array<Int>>): Int {

    val n = a.size

    var d1 = 0
    var d2 = 0

    for (i in 0 until n) {
        d1 += a[i][i]
        d2 += a[i][n - i - 1]
    }

    return abs(d1 - d2)

}