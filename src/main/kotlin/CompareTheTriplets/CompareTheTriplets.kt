package CompareTheTriplets

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

// First Solution

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var scoreA = 0
    var scoreB = 0

    if (a[0] > b[0]) {
        scoreA += 1
    } else if (a[0] < b[0]) {
        scoreB += 1
    }

    if (a[1] > b[1]) {
        scoreA += 1
    } else if (a[1] < b[1]) {
        scoreB += 1
    }

    if (a[2] > b[2]) {
        scoreA += 1
    } else if (a[2] < b[2]) {
        scoreB += 1
    }
    return arrayOf(scoreA, scoreB)
}

// Second Solution

fun compareTriplets2(a: Array<Int>, b: Array<Int>): Array<Int> {
    var scoreA = 0
    var scoreB = 0

    for (i in 0..2) {
        if (a[i] > b[i]) {
            scoreA += 1
        } else if (a[i] < b[i]) {
            scoreB += 1
        }
    }

    return arrayOf(scoreA, scoreB)
}

// Third Solution

fun compareTriplets3(a: Array<Int>, b: Array<Int>): Array<Int> {
    var scoreA = (0..2).count { a[it] > b[it] }
    var scoreB = (0..2).count { b[it] > a[it] }

    return arrayOf(scoreA, scoreB)
}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}