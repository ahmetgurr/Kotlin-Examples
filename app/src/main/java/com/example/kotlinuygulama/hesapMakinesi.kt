package com.example.kotlinuygulama

import java.util.Scanner

fun main() {
    // hesap makinesi islemler
    val scanner = Scanner(System.`in`)
    print("Birinci sayı: ")
    val number1 = scanner.nextDouble()
    print("İkinci sayı: ")
    val number2 = scanner.nextDouble()
    println("Toplam: ${top(number1, number2)}")
    println("Fark: ${cik(number1, number2)}")
    println("Çarpım: ${carp(number1, number2)}")
    println("Bölüm: ${bol(number1, number2)}")
}
fun top (a:Double,b:Double):Double{
    return a+b
}
fun cik(a: Double, b: Double): Double {
    return a - b
}

fun carp(a: Double, b: Double): Double {
    return a * b
}

fun bol(a: Double, b: Double): Double {
    if (b == 0.0) {
        println("payda sıfır ollamz")
        //throw IllegalArgumentException("Bölen 0 olamaz!")
    }
    return a / b
}