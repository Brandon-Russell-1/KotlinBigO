package app.bwizlabs.kotlingbigo

import org.springframework.boot.autoconfigure.SpringBootApplication
import java.math.BigInteger



@SpringBootApplication
class KotlingbigoApplication

/*Author: Brandon (Bwiz)*/

fun main(args: Array<String>) {
   // runApplication<KotlingbigoApplication>(*args)


    // Logarithmic 0(log n)
    println("Logarithmic 0(log n)")
    var i = 1
    var n = 5
    while (i < n) {
        println("Hey - I'm busy looking at: $i")
        i *= 2
    }

    //Binary Search
    println("Binary Search")
    val myIntArray = arrayOf(1,2,3,4,5)
    println("Recursive:")
    println(runBinarySearchRecursively(myIntArray,5,1,5))
    println("Iterative:")
    println(runBinarySearchIteratively(myIntArray,5,1,5))


    //Linear O(n)
    println("Linear")
    for (i in 0 until n) {
        println("Hey - I'm busy looking at: $i")
    }

    //N Log N
    println("n log n")
    for (i in 1..n) {
        var j = 1
        while (j < 8) {
            println("Hey - I'm busy looking at: $i and $j")
            j = j * 2
        }
    }

    //O(n^p) - Polynomial Time
    println("Polynomial Time")
    for (i in 1..n) {
        for (j in 1..n) {
            println("Hey - I'm busy looking at: $i and $j")
        }
    }

    //Exponential
    println("Exponential")
    i = 1
    while (i <= Math.pow(2.0, n.toDouble())) {
        println("Hey - I'm busy looking at: $i")
        i++
    }

    //Factorial
    println("Factorial")
    for (i in 1..factorialUsingForLoop(n)) {
        println("Hey - I'm busy looking at: $i")
    }


    //Class Example...there is a test for this
    var myMathExample = MathExample()
    println(myMathExample.addNums(1,1))

    val x = true
    if (x){
        println("x is true")
    }else{
        println("x is false")
    }

    val year = 2019
    when (year){
        2010 -> "2010!!!"
        2019 -> "2019!!!!!!!!!!!!!!"
        else -> "Not in list?"
    }

    var myList = mutableListOf(1,2,3,4)
    myList.forEach{println(it)}

    var myMap = mutableMapOf("Brandon" to "Cool", "Daniela" to "theRussell!")

    println(myMap["Brandon"])

    //Lambdas
    val square: (Int) -> Int = {it * it}
    println(square(2))



}

//Recursive Binary Search
fun runBinarySearchRecursively(
        sortedArray: Array<Int>, key: Int, low: Int, high: Int): Int {
    val middle = (low + high) / 2

    if (high < low) {
        return -1
    }

    return if (key == sortedArray[middle]) {
        middle
    } else if (key < sortedArray[middle]) {
        runBinarySearchRecursively(
                sortedArray, key, low, middle - 1)
    } else {
        runBinarySearchRecursively(
                sortedArray, key, middle + 1, high)
    }
}

fun runBinarySearchIteratively(
        sortedArray: Array<Int>, key: Int, low: Int, high: Int): Int {
    var low = low
    var high = high
    var index = Integer.MAX_VALUE

    while (low <= high) {
        val mid = (low + high) / 2
        if (sortedArray[mid] < key) {
            low = mid + 1
        } else if (sortedArray[mid] > key) {
            high = mid - 1
        } else if (sortedArray[mid] == key) {
            index = mid
            break
        }
    }
    return index
}

fun factorialUsingForLoop(n: Int): Long {
    var fact: Long = 1
    for (i in 2..n) {
        fact *= i
    }
    return fact
}
