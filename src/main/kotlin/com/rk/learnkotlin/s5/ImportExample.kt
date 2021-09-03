package com.rk.learnkotlin.s5.something

import com.rk.learnkotlin.s5.Department as Dept

//you can have any things as package name, but it is advisable not to



fun main() {
    println("My packages doesn't match")
    // using alias name - it is very useful when we have conflicting class names from two diff libraries
    println(Dept.IT)
}
