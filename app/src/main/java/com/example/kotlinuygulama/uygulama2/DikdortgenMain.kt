package com.example.kotlinuygulama.uygulama2

fun main() {
    val dikdortgen = Dikdortgen(10.0, 2.0)
    val alanDikdortgen = dikdortgen.alan()
    val cevreDikdortgen = dikdortgen.cevre()

    println("alan: $alanDikdortgen")
    println("cevre: $cevreDikdortgen")
}