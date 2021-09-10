package com.rk.learnkotlin.s7

import com.rk.learnkotlin.s5.Car

fun main() {
    val immutableMap = mapOf(
        1 to Car("blue", "Toyota", 2014),
        2 to Car("red", "Hyundai", 2010),
        3 to Car("white", "Audi", 2013)
    )

    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = mutableMapOf(
        "Karthik" to Car("red", "Toyota", 2014),
        "Anirv" to Car("blue", "Hyundai", 2010),
        "Vanu" to Car("white", "Audi", 2013)
    )
    println(mutableMap.javaClass)
    println(mutableMap)
    mutableMap["Ram"] = Car("gray", "Suzuki", 2010) // equivalent to put(K, V) operation


    //Destructuring example
    val pair = Pair(10, "ten")

    val firstValue = pair.first
    val secondValue = pair.second
    //Instead of above we can do like below in kotlin way :)
    // How it works is based on destructing declarations comes out of the box for data class
    // (or) we need to define component methods for each property (see the Car class below)
    val (firstValue1, secondValue1) = pair

    for((key, car) in mutableMap) {
        val (color, model, year) = car  // See how destructing works here :)
        println("$key's car detail: $color $model $year")
    }
}

class Car(val color: String, val model: String, val year: Int) {
    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year
}