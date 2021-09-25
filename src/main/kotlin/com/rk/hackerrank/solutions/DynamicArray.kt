
fun dynamicArray(n: Int, queries: Array<Array<Int>>): Array<Int> {
    val result = mutableListOf<Int>()
    val arr = mutableListOf<MutableList<Int>>()
    var lastAnswer: Int = 0
    var idx: Int
    for(query in queries) {
        idx = query[1] xor lastAnswer % n
        if(query[0] == 1) {
            arr[idx].add(query[2])
        } else {
            lastAnswer = arr[idx][query[2] % arr[idx].size]
            result.add(lastAnswer)
        }
    }
    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val q = first_multiple_input[1].toInt()

    val queries = Array<Array<Int>>(q, { Array<Int>(3, { 0 }) })

    for (i in 0 until q) {
        queries[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = dynamicArray(n, queries)

    println(result.joinToString("\n"))
}