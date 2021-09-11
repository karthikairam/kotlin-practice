package com.rk.learnkotlin.s8

import java.io.File

fun main() {

    val content = File("testfile.txt").reader().readText() //Reader has to be closed - but we didn't do it here
    //println(content)

    val lines = File("testfile.txt").reader().readLines() //Reader has to be closed - but we didn't do it here
    //lines.forEach { println(it) }

    //How to close reader - (verbose or java style)
    val reader = File("testfile.txt").reader()
    val lines2 = reader.readLines()
    //lines2.forEach { println(it) }
    reader.close()

    //How to close reader - ( Concise or Kotlin style ) - using "use" extension function
    val lines3 = File("testfile.txt").bufferedReader().use { it.readLines() } //used bufferedReader simply
    //lines3.forEach { println(it) }

    //Using bufferedReader
    File("testfile.txt").bufferedReader().forEachLine { println(it) }
}

