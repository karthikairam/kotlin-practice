package com.rk.learnkotlin.s7

fun main() {

    // Lambdas can be run using run statement
    run { println("I'm in a lambda!") }

    val employees = listOf(
        Employee("Karthik", "Ram", 2012),
        Employee("Anirv", "Karthik", 2015),
        Employee("Vanu", "Nal", 2010)
    )

    println(employees.maxOf { employee -> employee.startYear })
    //or using it
    println(employees.maxOf { it.startYear })
    //or member reference
    println(employees.maxOf(Employee::startYear))

    //Lambda in kotlin can access var (mutable) variable and modify it
    var num = 10
    run {
        num++
        println(num)
    }

    // Member / method reference
    run(::topLevel)
}

fun topLevel() {
    println("Top level function exec")
}

//Method parameters are val (final) in Kotlin
fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
        //num++ // You can't modify the method parameter since it is by default val
    }
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int)