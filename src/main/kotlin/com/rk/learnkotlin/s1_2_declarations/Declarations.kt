package com.rk.learnkotlin.s1_2_declarations

fun main(args: Array<String>) {
    var number: Short
    number = 31
    number = 20

    val employee = Employee("Karthik", 500)
    employee.name = employee.name + "aiselvan"

    val names = arrayListOf("Karthik", "Anirv", "Vanu")
    println(names[1])

    val someObj: Any
    someObj = employee
    println(someObj.name)
    println(someObj)

    val rhymes = """Thiru kural is one of the best
        |Bharathiyaar is one of the best poet from TamilNadu India.
        |I pray God Muruga
    """.trimMargin()

    println(rhymes)
}

class Employee(var name: String, val id: Int) {

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Employee

        if (name != other.name) return false
        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + id
        return result
    }


}