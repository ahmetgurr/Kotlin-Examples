package com.example.kotlinuygulama.uygulama3



fun main() {
    val liste = listOf<Int>(1,2,3,4,5,6)
    val oddNumber = tekSayılarListeesi(liste)


    println("tek sayilar: $oddNumber")
}

fun tekSayılarListeesi (list: List<Int>): List<Int>{


    return list.filter { it % 2 != 0 }
}