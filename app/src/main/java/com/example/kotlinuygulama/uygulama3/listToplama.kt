package com.example.kotlinuygulama.uygulama3

fun main() {
    val liste = listOf(3,5,7,9)
    val top = toplamListe(liste)

    println(" liste toplam : $top")



}



fun toplamListe(list: List<Int>): Int {
    var top = 0
    for (k in list) {
        top += k


    }
    return top
}
