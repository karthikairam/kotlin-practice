package com.rk.learnkotlin.s5

fun main() {
    println("this is all in lowercase".upperFirstAndLast())
}

//Just extended an additional function for the String class of Kotlin. How cool is that :)
fun String.upperFirstAndLast(): String {
    return substring(0, 1).uppercase() + substring(1, length - 1) + substring(
        length - 1,
        length
    ).uppercase()
}
