package com.example.kotlinuygulama.uygulama2

fun main() {
    val dikdortgen1 = Dikdortgen(10.0, 2.0)

    val alanDikdortgen = dikdortgen1.alan()
    val cevreDikdortgen = dikdortgen1.cevre()

    println("alan: $alanDikdortgen")
    println("cevre: $cevreDikdortgen")
}