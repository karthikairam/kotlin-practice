package com.rk.learnkotlin.s8

import java.io.DataInputStream
import java.io.EOFException
import java.io.FileInputStream

fun main() {

    val di = DataInputStream(FileInputStream("testfile.bin"))
    var si: String

    try {
        while (true) {
            si = di.readUTF()
            println(si)
        }
    } catch (e: EOFException) {
    } finally {
        if(di != null)
            di.close()
    }

    //There is no try with resource in kotlin, but we can achieve the same using "use" extension function
    //Below code is same above
    val di1 = DataInputStream(FileInputStream("testfile.bin"))
    di1.use {
        try {
            while (true) {
                si = it.readUTF()
                println(si)
            }
        } catch (e: EOFException) {
        }
    }
}