package com.rk.learnkotlin.s5

fun main() {

    val car1 = Car("Red", "Tata", 2021)
    val car2 = Car("Red", "Tata", 2021)
    println(car1 == car2)
    val car3 = car1.copy() //exact copy
    println(car3)
    val car4 = car1.copy(color = "Blue") //Copy with slight modification
    println(car4)
}

//Data class in kotlin comes with equals, toString, hashcode and copy methods as free :)
data class Car(val color:String, val brand: String, val year: Int)
