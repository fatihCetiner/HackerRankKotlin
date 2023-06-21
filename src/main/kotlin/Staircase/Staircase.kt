package Staircase

fun main() {
    staircase(4)
}

// First Solution

fun staircase(n: Int): Unit {
    // n = 4
    /*
    BBB#
    BB##
    B###
    ####
     */
    for (i in 1..n) {

        for (j in 1..n - i) {
            print(" ")
        }

        for (j in 1..i) {
            print("#")
        }
        println()
    }
}

// Second Solution

fun staircase2(n: Int): Unit {

    for (i in 1..n) {

        repeat(n - i) {
            print(" ")
        }

        repeat(i) {
            print("#")
        }

        println()
    }
}

// Third Solution

fun staircase3(n: Int): Unit {

    for (i in 1..n) {

        var line = " ".repeat(n-i)
        line += "#".repeat(i)

        println(line)
    }
}