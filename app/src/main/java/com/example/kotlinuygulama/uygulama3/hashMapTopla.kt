package com.example.kotlinuygulama.uygulama3

fun main() {
    val myHashMap = hashMapOf(
        "a" to 1,
        "b" to 2,
        "c" to 3,
        "d" to 4
    )
    val totalSum = toplami(myHashMap)
    println("toplam: $totalSum")
}

fun toplami(map: HashMap<String, Int>): Int {
    return map.values.sum()
}
