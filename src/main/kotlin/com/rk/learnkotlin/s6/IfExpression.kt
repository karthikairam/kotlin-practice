package com.rk.learnkotlin.s6

fun main() {
    //Unlike java, "if" in kotlin can act as an expression as well as statement :) so we don't need ternary operator
    val condition = 4 > 9
    val num = if (condition) {
        println("In if")
        50 // value to be returned
    } else {
        println("In else")
        100 // value to be returned
    }

    //In String template
    println("Value of this condition is ${if(condition) {
        println("funny though,print inside print - if")
        50
    } else{
        println("funny though, print inside print - else")
        560
    }
    }")

    //we can use it as normal condition statement
    if(condition) {
        println("Something to do")
    }
}