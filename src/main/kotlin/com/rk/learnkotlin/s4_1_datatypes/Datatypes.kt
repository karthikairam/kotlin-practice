package com.rk.learnkotlin.s4_1_datatypes

import com.rk.learnkotlin.javacode.SomeJavaHelper

fun main() {

    val someInt = 22
    val someLong = 22L  //Explicitly mention L in the value or type in the declaration
    val someLong1: Long = 22  //Explicitly mention L in the value or type in the declaration
    val someLong2: Long = someInt.toLong()  // Kotlin doesn't support type widening which java supports

    val someDouble = 34.4563
    println("someDouble is Double: ${someDouble is Double}")

    val someFloat = 34.5434f
    val someDouble2 = someFloat.toDouble()

    val char = 'b'
    val myCharInt = 65.toChar() // Assigning int to char is supported in Java, but not in Kotlin

    val myBoolean = true
    var returnFlag = SomeJavaHelper().receive_booleanFromKotlin(myBoolean)
    println(returnFlag)

    returnFlag = SomeJavaHelper().receive_BooleanFromKotlin(myBoolean)
    println(returnFlag)
}

fun returnUnitValue(): Unit {
    println("In a method that returns Unit")
    return Unit
}

/**
 * Either it has to throw exception or it doesn't return due to infinite execution
 */
fun returnNothing(): Nothing {
    println("In a method that returns Nothing")
    throw RuntimeException()
}