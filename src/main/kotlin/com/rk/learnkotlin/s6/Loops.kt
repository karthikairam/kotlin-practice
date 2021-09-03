package com.rk.learnkotlin.s6

fun main() {

    // Kotlin doesn't have Java like "for" loop
    // like for(int 1=0; i<10;i++) {}
    // But available in the below flavor

    val range = 1..5 // or  1.rangeTo(5)
    for (i in range) {
        println(i)
    }

    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ" // Since String-range doesn't have iterator, so it doesn't work with for loop
    //But String class itself has iterator, so it works with for loop to iterator through character
    val str = "Hello"
    for(c in str) {
        println(c)
    }

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("XXXXXXX" in stringRange)
    println("XYZZ" in stringRange) // outside the range

    val backwardRange = 5.downTo(1)

    //Step
    val stepRangeOfThree = (3..15).step(3)
    //step in for loop
    for (n in 1..20 step 4) {
        println(n)
    }
    // To make end number exclusive
    for (n in 1 until 20) println(n)

    //Reverse the step
    for (i in 20 downTo 1 step 4) println(i)

    //Array looping
    val seasons = arrayOf("spring", "summer", "winter", "fall")
    for (season in seasons) println(season)

    val isNotSeason = "something" !in seasons
    println(isNotSeason)

    val notInRange = 32 !in 1..20

    for (index in seasons.indices) {
        println("Value is ${seasons[index]}")
    }

    //Nested for loops - big-O is very bad in terms of time complexity
    for (i in 1..3)
        jloop@ for (j in 1..4) // Giving name for j loop
            for(k in 5..10) {
                println("The values of i: $i, j:$j, k:$k")
                if(k == 7) break@jloop
                //if(k == 6) continue@jloop
            }

}