package PlusMinus

fun main() {
    plusMinus(arrayOf(-1, -1, 0, 1, 1))
}

// First Solution

fun plusMinus(arr: Array<Int>): Unit {

    var positives = 0
    var negatives = 0
    var zeros = 0

    for (element in arr) {

        if (element > 0) positives += 1
        if (element < 0) negatives += 1
        if (zeros == 0) zeros += 1

    }

    val n = arr.size.toDouble()

    println(String.format("%6f", positives / n))
    println(String.format("%6f", negatives / n))
    println(String.format("%6f", zeros / n))

}

// Second Solution

fun plusMinus2(arr: Array<Int>): Unit {

    val positives = arr.count { it > 0 }
    val negatives = arr.count { it < 0 }
    val zeros = arr.count { it == 0 }

    val n = arr.size.toDouble()

    println(String.format("%6f", positives / n))
    println(String.format("%6f", negatives / n))
    println(String.format("%6f", zeros / n))

}