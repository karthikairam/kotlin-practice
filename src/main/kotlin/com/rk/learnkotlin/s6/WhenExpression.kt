package com.rk.learnkotlin.s6

fun main() {
    //When in kotlin is like switch in java with steroid :) as author said - l like this stmt though :)

    //Type 1

    val choiceNum = 100
    when (choiceNum) { //Break is implicitly added for all the cases
        100 -> println("Value is 100")
        in 200..299 -> println("Value is 200") // range is allowed
        300, 400 -> println("Value is 300") // Multi value is allowed
        500 -> println("Value is 400")
        else -> println("Unknown value")
    }

    //Values can be returned by using when as expression
    val season = Seasons.SPRING
    val result = when (season) {
        Seasons.SPRING -> {
            println("It is ${Seasons.SPRING}")
            10
        }
        Seasons.SUMMER -> {
            println("It is ${Seasons.SUMMER}")
            20
        }
        Seasons.FALL -> {
            println("It is ${Seasons.FALL}")
            30
        }
        Seasons.WINTER -> {
            println("It is ${Seasons.WINTER}")
            40
        }
        //else vase is not required if all the enum cases are added.
    }
    println("Season value: $result")

    //Instead of multiple if else if conditions - we can use when like below - I would say headless when :)
    val num1 = 50; val num2 = 60
    when {
        num1 > num2 -> println("$num1 is greater than $num2")
        num1 < num2 -> println("$num1 is lesser than $num2")
        else -> println("$num1 & $num2 are equal")
    }
}

enum class Seasons {
    SPRING, SUMMER, FALL, WINTER
}