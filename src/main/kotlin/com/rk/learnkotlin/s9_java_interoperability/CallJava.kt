package com.rk.learnkotlin.s9_java_interoperability

fun main() {
    val car = Car("green", "BMW", 2015)
    car.color = "red" // can't set null else throws Exception at runtime as @NotNull is annotated for this field.
    car.model = null // nullable field if you don't mention anything or annotated with @Nullable from jetbrains-annotation lib in java class
    val model: String? = car.model //When you explicitly mention @Nullable, then you can only assign to Kotlin nullable type (the one with ?)
    /**
     * If you haven't declared with any of those two annotations, then it is treated as Platform Type
     * (which ends with ! like String! - check using mouse hover)
     * As shown below, it gives compiler error BTW.
     */
    //val color: Int = car.color
    println(car)

    car.variableMethod(5, "Hello", "Karthik")

    val strings = arrayOf("Hello", "Karthik")
    //car.variableMethod(10, strings) // Doesn't work as Kotlin does have var-arg equivalent of Java. So we need to spread using *
    car.variableMethod(5, *strings)

    //passing primitive array from Kotlin to Java
    //car.wantsIntArray(arrayOf(1,2,3)) - will not work as arraysOf() gives Array<Int>. Note Kotlin treats array as genetics :)
    car.wantsIntArray(arrayOf(1,2,3).toIntArray()) //To convert Kotlin's Array<Int> to primitive int array supported in Java
    // (or)
    car.wantsIntArray(intArrayOf(1,2,3))


}