package com.rk.learnkotlin.s5

import java.time.Year

fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
}

// We can't inherit the object class to another class, similar to data class :)
// object class is singleton - so no need of object creation - we access this as if a static members, but it is not :)
// for static member behaviour - we need to use companion class
object CompanyCommunications {

    private val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear our company. All rights reserved."
}

