package com.example.kotlinuygulama.uygulama2.o4

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val sayilar = ArrayList<Int>()

    for (i in 1..5) {
        print("sayilari gir:")
        val sayi = scanner.nextInt()
        sayilar.add(sayi)
    }
    val toplam = sayilarinToplami(sayilar)
    println("sayilarin toplami: $toplam")
    scanner.close()
}

fun sayilarinToplami(sayilar: ArrayList<Int>): Int {
    var toplam = 0
    for (sayi in sayilar) {
        toplam += sayi
    }
    return toplam
}

