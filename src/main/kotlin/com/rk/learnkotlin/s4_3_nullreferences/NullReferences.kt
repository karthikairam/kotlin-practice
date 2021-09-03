package com.rk.learnkotlin.s4_3_nullreferences

fun main() {
    val str: String? = null
    println("What it is the value of str: $str")

    val str1 = str?.length?.toLong()?.toString() ?: "No Value"
    val str2: Any? = null
    val str3 = str2 as? String

    //We can't pass nullable variable to method with non-nullable arg
    val strNull = null
    //printText(strNull!!) //prone to KotlinNPE exception.
    strNull?.let { printText(it) }

    val nullableInts = arrayOfNulls<Int>(5)
    for (ele in nullableInts)
        println(ele)
    nullableInts[0].toString()
}

fun printText(text: String) {
    println(text)
}