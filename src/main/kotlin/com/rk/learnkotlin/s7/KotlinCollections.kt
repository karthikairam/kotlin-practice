package com.rk.learnkotlin.s7

fun main() {

    // Immutable list ()internally Java's mutable (yes mutable) list
    val seasons = listOf("spring", "summer", "fall", "winter")
    println(seasons.javaClass)

    val mutableSeasons = mutableListOf("some", "other")
    println(mutableSeasons.javaClass)
    mutableSeasons += "unknown" // It is equal to add(T)
    mutableSeasons[2] = "replaced" // It is equalent to set(index, T)

    //Array to List
    val array = arrayOf("black", "white", "green")
    val listFromArray1 = listOf(*array) // spread the elements using *, else it will become List<Array<T>> :)
    val listFromArray2 = array.toList()
    val mListFromArray = array.toMutableList()

    //List to Array

    val array1 = listFromArray1.toTypedArray()

    //Java ArrayList
    val arrayListOfJava = arrayListOf("TN", "KL", "KA")

    //mutable empty list from Kotlin
    val emptyList = emptyList<String>()
    println(emptyList.javaClass)
    //emptyList += "FIRST"
    //emptyList += "SECOND"
    println(emptyList)

    //It will gracefully ignore the nulls whenever it gets added
    val notNullList = listOfNotNull("A", null, "B")
    println(notNullList)
    //notNullList += null   //you can't add null after the creation of list :)

    val ints = intArrayOf(1, 2, 3)
    println(ints.toList())
}