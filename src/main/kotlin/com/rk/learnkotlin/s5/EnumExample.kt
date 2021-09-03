package com.rk.learnkotlin.s5

fun main() {
    println(Department.IT.getDeptInfo())
}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resource", 5),
    IT("Information Technology", 30);

    fun getDeptInfo() = "The $fullName department has $numEmployees employees"
}