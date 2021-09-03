package com.rk.learnkotlin.s5

fun main() {
    println(ExampleFactory.keepItAsIs("this is something").someValue)
    println(ExampleFactory.upperOrLowerCase("this is something", false).someValue)
}

class ExampleFactory(val someValue: String) {

    //Static members are grouped under companion object class
    companion object /* name is optional */{
        fun keepItAsIs(str: String) = ExampleFactory(str)

        fun upperOrLowerCase(str: String, lower: Boolean): ExampleFactory {
            return if(lower)
                ExampleFactory(str.lowercase())
            else
                ExampleFactory(str.uppercase())
        }
    }
}