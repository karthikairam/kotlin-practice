package com.rk.learnkotlin.s8

import java.io.File
import java.util.*

sealed class CardMessage {
    abstract val messageType: String
}

data class FinancialCardMessage (override val messageType: String): CardMessage() {
}

data class DeclinedCardMessage (override val messageType: String): CardMessage() {
}

fun main() {
    var cardMessage1: CardMessage = FinancialCardMessage("TNT")
    cardMessage1 = DeclinedCardMessage("TNT")

    println(cardMessage1.javaClass.simpleName)
    /*println(UUID.randomUUID().toString())
    File(".")
        .walk(FileWalkDirection.BOTTOM_UP)  // little verbose way of Walking file tree in bottom up way
        //.walkBottomUp()                   // simple and straight - bottom up
        //.walk(FileWalkDirection.TOP_DOWN) // little verbose way of Walking file tree in top down way
        //.walkTopDown()                    // simple and straight - top down
        .filter { it.name.endsWith(".kt") }
        .forEach { println(it) }

    println(UUID.randomUUID().hyphenless)*/
}

val UUID.hyphenless get() = toString().replace("-", "")