package com.example.kotlinuygulama

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Kullanıcıdan bir sayı al
    print("Bir sayı giriniz: ")
    val userInput = scanner.nextLine()

    try {
        // String türündeki kullanıcı girdisini Double tipine dönüştür
        val number = userInput.toDouble()

        println("Girilen sayının ondalıklı sayı hali: $number")
    } catch (e: NumberFormatException) {
        println("Hatalı giriş! Lütfen bir sayı giriniz.")
    }
}