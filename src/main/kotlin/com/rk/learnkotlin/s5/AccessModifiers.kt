package com.rk.learnkotlin.s5

fun main() {
    val obj = PrivateClass()
    println(obj)

    val emp1 = Employee("Karthik")
    println(emp1.firstName)
    println(emp1.fullTime)
    val emp2 = Employee("Vanu", false)
    println(emp2.firstName)
    println(emp2.fullTime)

    val vEmp1 = VerboseEmployee("Karthik")
    println(vEmp1.firstName)
    println(vEmp1.fullTime)
    val vEmp2 = VerboseEmployee("Vanu", false)
    println(vEmp2.firstName)
    println(vEmp2.fullTime)
}

private class PrivateClass {} // {} is optional

class Employee (val firstName: String, var fullTime: Boolean = true)

//This is a verbose way - same as above - to show how concise the kotlin is
class VerboseEmployee /* primary constructor */ constructor(firstName: String) {

    val firstName: String
    var fullTime: Boolean
    init {
        this.firstName = firstName
        this.fullTime = true
    }

    //secondary constructor
    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
        this.fullTime = fullTime
    }
}

//we can write secondary only constructor as well with Kotlin classes
class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}