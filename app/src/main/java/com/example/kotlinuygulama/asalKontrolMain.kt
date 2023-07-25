package com.example.kotlinuygulama

import java.util.Scanner

fun main() {
    //asallık kontrol etme
    val scanner = Scanner(System.`in`)
    print("İlk sayıyı gir: ")
    val sayi1 = scanner.nextInt()
    print("İkinci sayiyi gir: ")
    val sayi2 = scanner.nextInt()

    if (asalMi(sayi1)) {
        println("$sayi1 asal sayi.")
    } else {
        println("$sayi1 asal değil!.")
    }
    if (asalMi(sayi2)) {
        println("$sayi2 asal sayi.")
    } else {
        println("$sayi2 asal değil!.")
    }
}

fun asalMi(sayi: Int): Boolean {
    if (sayi <= 1)
        return false

    for (i in 2 until sayi) {
        if (sayi % i == 0) {
            return false
        }
    }
    return true
}