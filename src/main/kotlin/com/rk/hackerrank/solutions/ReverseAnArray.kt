package com.rk.hackerrank.solutions

fun reverseArray(a: Array<Int>): Array<Int> {
    val size = a.size
    var temp: Int
    for(n in 0 until ((size/2))) {
        temp = a[size - n - 1]
        a[size - n - 1] = a[n]
        a[n] = temp
    }
    return a;
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val res = reverseArray(arr)

    println(res.joinToString(" "))
}