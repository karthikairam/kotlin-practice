package com.rk.learnkotlin.s7

fun main() {
    val immutableSet = setOf(10, 15, 19, 3, 5, -22)
    println(immutableSet.plus(20)) // produces new set with new element added
    println(immutableSet.plus(10)) // Set doesn't take the duplicate, so 10 will not be added same as Java
    println(immutableSet.minus(19)) // produces new set by removing 19
    println(immutableSet.minus(100)) // produces new set with same elements as 100 is not present
    println(immutableSet.average()) // double value with avg of the set
    println(immutableSet.drop(3)) // drops 3 elements from the front

    val mutableSet = mutableSetOf(1,2,3,4,5)
    mutableSet.plus(10) // again produces new set regardless of immutable or mutable set
    println(mutableSet)
}