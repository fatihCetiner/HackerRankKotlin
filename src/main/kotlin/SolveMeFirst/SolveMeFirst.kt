package SolveMeFirst

import java.util.*

// First Solution

fun solveMeFirst(a: Int, b: Int): Int {
    return a + b
}

// Second Solution

fun solveMeFirst2(a: Int, b: Int): Int = a + b


// Third Solution

fun solveMeFirst3(a: Int, b: Int) = a + b


fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}