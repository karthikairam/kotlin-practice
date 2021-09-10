package com.rk.learnkotlin.s7

fun main() {
    val listAny: Any = ""
    if(listAny is List<*>) {

    }
}


fun <T> append(item1: T) where T: Number, T: Comparable<T> {
    println(item1)
}