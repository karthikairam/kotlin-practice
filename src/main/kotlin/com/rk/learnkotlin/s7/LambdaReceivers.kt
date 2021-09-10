package com.rk.learnkotlin.s7

fun main() {
    val employees = listOf(
        Employee("Karthik", "Ram", 2012),
        Employee("Anirv", "Karthik", 2015),
        Employee("Vanu", "Nal", 2010)
    )
    println(countTo100())
    println(countTo100_With_LambdaReceiver())
    println(countTo100_Apply_LambdaReceiver())

    findByLastName(employees, "Ram")
    findByLastName(employees, "Unknown")

    //Use of labels in the nested "apply" or even with "with"
    "Some string".apply outerLabel@ {
        "Another String".apply {
            println(uppercase()) // this toString() is of "Another String"
            //How to access outer lambda receiver ? then check below
            println(this@outerLabel.uppercase())
        }
    }
}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach somelabel@ {
        if(it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName")
            // return  #non-local return
            return@somelabel // return from lambda only
        }
    }

    println("Nope, there is no emp with the last name $lastName")
}

fun countTo100_Apply_LambdaReceiver(): String {
    return StringBuilder("1").apply {
        for (i in 2..100) {
            append(", $i")
        }
        /*
            don't have any "return" statement, if you do it will be a non-local return as explained below.
            Also, normally it returns "this" implicitly from the lambda like below

            this
        */
    }.toString()
}

fun countTo100_With_LambdaReceiver(): String {
    return with(StringBuilder("1")) {
        for (i in 2..100) {
            append(", $i")
        }
        toString()  // local return (meaning only from the lambda)
        /*
        return toString() // This is non-local return, meaning, it will return from method itself not from the lambda
        Note: this differs from Java
        */
    }
}

fun countTo100(): String {
    val builder = StringBuilder("1")
    for (i in 2..100) {
        builder.append(", $i")
    }
    return builder.toString()
}