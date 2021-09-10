package com.rk.learnkotlin.s7

import com.rk.learnkotlin.s5.Car

fun main() {
    /*
       Sequence in Kotlin == Stream in Java.
       Difference between Collection and Sequence, sequence processes one item at a time.
       Sequence is good for large data set, as it take one item at a time.
       Whereas iterable creates intermediate collection for each step
           - meaning every ele is processed before moving to next.
       For small data sets, normal iterable is sufficient as Kotlin collections are efficient.
    */
    val immutableMap = mapOf(
        1 to Car("blue", "Toyota", 2014),
        2 to Car("red", "Hyundai", 2010),
        17 to Car("red", "BMW", 2016),
        8 to Car("white", "Audi", 2013),
        3 to Car("white", "BMW", 2008),
    )

    //Normal collection iteration - Eager - because no terminal operator concept here
    println(
        immutableMap
            .filter { it.value.brand == "BMW" } // collection is returned
            .map { it.value.color }
    )

    //Using sequence - Lazy
    println(
        immutableMap.asSequence()
            .filter { it.value.brand == "BMW" } // returns Sequence on each step and flows one item at a time
            .map { it.value.color }
            .toList()   // Terminal operator is important to start the sequence processing
    )


}