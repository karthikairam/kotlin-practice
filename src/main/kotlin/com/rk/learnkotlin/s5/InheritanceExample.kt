package com.rk.learnkotlin.s5

fun main() {
    val printer = LaserPrinter("LX")
    printer.printerModel()

    println(Citizen().number)
}

abstract class Printer(val modelName: String) { //Using open is redundant when we use abstract
    open fun printerModel() = println("The is Model of this printer is $modelName")
    abstract fun bestSellingPrice(): Double
}

class LaserPrinter(modelName: String): Printer(modelName) {
    override fun printerModel() = println("The is Model of this printer is $modelName")
    override fun bestSellingPrice(): Double = 129.99
}

//Part 2:
open class Something {

    val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }
}

class SomethingElse : Something {

    constructor(someOtherParameter: String, z: Int): super(someOtherParameter) {
        println("I'm in the child's constructor")
    }
}

//You can't have inheritance with data classes - so you can mark it as open :)
data class DataClass(val number: Int) {
}

//Interfaces
//Note we don't need "open" :)
interface LivingThing {

    //we can have properties in interface
    //abstract field - its new isn't it for java guys :)
    val number: Int

    //concrete field (needs getter method) - again it's new for java guys
    val concreteNumber: Int
    get() = number * 100

    fun eatFood(food: String)
}

interface Human: LivingThing {
    fun speakWords(): String
}

class Citizen(override val number: Int = 25): Human {

    override fun speakWords(): String {
        TODO("Not yet implemented")
    }

    override fun eatFood(food: String) {
        TODO("Not yet implemented")
    }
}