package com.rk.learnkotlin.s5

//Contants in Kotlin
val PI = 3.14

fun main() {
    println(PI)

    val emp1 = CustomEmployee("Karthik")
    emp1.fullTime   // Actually it calls the getter method - not the direct field
    val emp2 = CustomEmployee("Vanu")
    emp1.fullTime = false // Actually it calls the setter method - not assigning directly to the field
}

class CustomEmployee(val firstName: String, fullTime: Boolean = true) {
    var fullTime = fullTime // Getter and Setter for the property should be followed immediately
    get() {
        println("Running the custom get()")
        return field
    }
    set(value) {
        println("Running the custom set()")
        field = value
    }
}