package com.rk.learnkotlin.s5

fun main() {

}

// Inline functions are not compiled to function at all.
// Instead, it will compile into codes inline at the call site
inline fun labelMultiply(a: Int, b: Int) = a * b //See the warning over inline keyword
// Best performance when we use it for lambdas

