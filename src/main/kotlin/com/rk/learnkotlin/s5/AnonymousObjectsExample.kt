package com.rk.learnkotlin.s5

fun main() {

    var counter: Int = 0
    consumeAnonymousClass(object: SomeInterface {
        override fun mustImplement(num: Int): String {
            counter++ //You can access mutable variables as well in the anonymous class - quite diff from Java :)
            return "The calculated value is: ${num * 100}"
        }
    })
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun consumeAnonymousClass(exe: SomeInterface) {
    println("Executing Anonymous Class: ${exe.mustImplement(25)}")
}


