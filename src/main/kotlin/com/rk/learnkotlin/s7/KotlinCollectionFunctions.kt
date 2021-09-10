package com.rk.learnkotlin.s7

fun main() {
    val seasons = listOf("spring", "summer", "fall", "winter")
    val colors = listOf("black", "white", "green")

    println(seasons.last())
    println(colors.asReversed())

    //Safe index access
    println(colors.getOrNull(5))
    println(colors.getOrElse(5) {
        println(it)
        ""
    })

    //Int List functions
    val intList = listOf(1, 2, 3, 4, 5)
    println(intList.maxOrNull())

    // Combining lists
    println(seasons.zip(colors)) // Its like reactor core operator :) makes it as Pair<T1, T2>
    println(listOf(seasons, colors)) // It just creates as List<List<T>>
    println(seasons + colors)

    val duplicateSeasons = listOf("spring", "summer", "fall", "summer", "winter", "unknown")
    val duplicateColors = listOf("black", "white", "red", "green", "red", "unknown")
    //combine doesn't filter duplicates
    println(duplicateSeasons + duplicateColors)
    //Union to skip duplicates
    println(duplicateSeasons.union(duplicateColors))    // produces new list
    //distinct fun to skip duplicates from a list
    println(duplicateSeasons.distinct())    // produces new list
    //To get a common elements
    println(duplicateSeasons.intersect(duplicateColors)) // produces new list
}