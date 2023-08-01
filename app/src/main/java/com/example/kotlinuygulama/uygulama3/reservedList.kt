package com.example.kotlinuygulama.uygulama3


fun main() {
    val liste = listOf<Int>(1,2,3,4,5,6,7,8,9)
    val reservedListe = cevrilmis(liste)
    println("ters çevrilmis liste: $reservedListe")

}
fun cevrilmis(list: List<Int>): List<Int> {
    return list.reversed()
}
