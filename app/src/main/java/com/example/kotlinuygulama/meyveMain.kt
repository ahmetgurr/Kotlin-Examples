package com.example.kotlinuygulama

fun main() {
    val elma = Elma("eksi elma", 2, "c,d vitamini var")

    println("Elma Adı: ${elma.ad}")
    println("Tatlık Derecesi:${elma.tatlilikDerecesi}")
    println("Vitamin Değeri: ${elma.vitaminDegeri}")


    elma.yiyebilir()

}