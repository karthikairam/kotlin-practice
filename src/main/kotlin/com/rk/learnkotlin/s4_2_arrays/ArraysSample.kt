package com.rk.learnkotlin.s4_2_arrays

import com.rk.learnkotlin.javacode.SomeJavaHelper
import java.math.BigDecimal

fun main() {
    val names = arrayOf("Karthik", "Anirv", "Vanu")
    val longNumbers = arrayOf(1L, 2, 3)
    println("longNumbers is ${longNumbers is Array<Long>}")

    val longNumbers2 = arrayOf<Long>(1, 2, 3) // Since the values are Int, we need to explicitly mention Long
    println("longNumbers2 is ${longNumbers2 is Array<Long>}")

    val intNumbers = arrayOf(1, 2, 3)
    println("intNumbers is ${intNumbers is Array<Int>}")

    println(intNumbers[2])

    val evenNumbers = Array(16) { i -> i * 2 }
    for (evenNumber in evenNumbers) {
        println("$evenNumber, ")
    }

    val lotsOfNumbers = Array(1000) { i -> i + 1 }

    val allNines = Array(100) { 9 }


    val mixedArray = arrayOf("Hello", 33, BigDecimal(10.5), 'k')
    for (element in mixedArray)
        println(element)

    // General Kotlin array will not work when we call a method with int[] in Java
    // SomeJavaHelper().receiveIntArrayFromKotlin(allNines)
    // But you can convert it to IntArray
    SomeJavaHelper().receiveIntArrayFromKotlin(allNines.toIntArray())
    // Or we have to use IntArray from Kotlin for  Java interoperability
    val intArray = intArrayOf(1, 3, 4)

    // Convert the IntArray to Array<Int> using,
    val convertedTypeArray = intArray.toTypedArray()


}