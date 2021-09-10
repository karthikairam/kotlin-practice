package com.rk.learnkotlin.s7

import com.rk.learnkotlin.s5.Car

fun main() {

    val immutableSet = setOf(10, 15, 19, 3, 5, -22)

    println(immutableSet.filter { it % 2 != 0 })


    val immutableMap = mapOf(
        1 to Car("blue", "Toyota", 2014),
        2 to Car("red", "Hyundai", 2010),
        17 to Car("red", "BMW", 2016),
        8 to Car("white", "Audi", 2013),
        3 to Car("white", "BMW", 2008),
    )

    //Filter
    println(immutableMap.filter { it.value.year == 2014 })
    //map function
    println(immutableMap.map { it.value.year }) // get the year properties of all the values as list
    //Combination of map and filter
    println(immutableMap.filter { it.value.brand == "BMW"}.map { it.value.color })
    //Check whether the collection satisfies the given condition on all the elements
    println(immutableMap.all { it.value.year > 2015 })/* returns boolean*/
    // condition matches on any of the element
    println(immutableMap.any { it.value.year > 2015 })
    // find a car which has the year >= 2014
    println(immutableMap.values.find { it.year >= 2014 }) // single item and note that find {} is on List not on the Map
    //Count no. of cars which are above 2014
    println(immutableMap.count { it.value.year > 2014})
    //Group by
    println(immutableMap.values.groupBy { it.brand })
    //Sorting in map
    println(immutableMap.toSortedMap())
    //Sort the list
    println(immutableMap.values.sortedBy { it.year })


    val mutableMap = mapOf(
        1 to Car("blue", "Toyota", 2014),
        2 to Car("red", "Hyundai", 2010),
        17 to Car("red", "BMW", 2016),
        3 to Car("white", "Audi", 2013)
    )

    //Example 2
    val ints = arrayOf(1,2,3,4,5)
    val add10List: MutableList<Int> = mutableListOf()
    for (i in ints) {
        add10List.add(i + 10)
    }
    //instead, we can add using map()
    val add10ListWithMapFun = ints.map { it + 10 }
    println(add10ListWithMapFun)

}