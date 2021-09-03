package com.rk.learnkotlin.s6

import java.lang.NumberFormatException

fun main() {
    println(parseStringToInt("22.5")?:"The number not parsable")

}

fun parseStringToInt(str: String): Int? {
    return try {
        Integer.parseInt(str) //returning the parsed value
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("Do clean-up")
        //you can't return anything here
    }
}