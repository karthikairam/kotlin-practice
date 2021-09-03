package com.rk.learnkotlin.s5

fun main() {
    println(labelMultiplyVerbose(2, 3, "The answer is:"))
    println(labelMultiply(2, 3))

    //Named arguments can be in any order
    println(labelMultiply(label = "Result is:", operand2 = 20, operand1 = 30))
}

fun labelMultiplyVerbose(operand1: Int, operand2: Int, label: String): String {
    return "$label ${operand1 * operand2}"
}

fun labelMultiply(operand1: Int, operand2: Int, label: String = "The answer is:") =
    "$label ${operand1 * operand2}"