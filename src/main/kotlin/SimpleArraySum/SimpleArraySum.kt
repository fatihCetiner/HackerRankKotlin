package SimpleArraySum

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
 * Complete the 'simpleArraySum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY ar as parameter.
 */

// First Solution

fun simpleArraySum(ar: Array<Int>): Int {
    var sum = 0
    for (element in ar) {
        sum += element
    }
    return sum

}

// Second Solution

fun simpleArraySum2(ar: Array<Int>): Int {
    var sum = 0
    ar.forEach {
        sum += it
    }
    return sum
}

// Third Solution

fun simpleArraySum3(ar: Array<Int>): Int {
    return ar.sum()
}

// Fourth Solution

fun simpleArraySum4(ar: Array<Int>): Int = ar.sum()

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}