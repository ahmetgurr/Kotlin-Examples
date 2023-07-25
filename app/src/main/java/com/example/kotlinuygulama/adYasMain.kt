package com.example.kotlinuygulama

import java.util.Scanner

fun main() {
    //ad yas girme

    val scanner = Scanner(System.`in`)

    print("Ad: ")
    val name = scanner.nextLine()
    print("yas: ")
    val age = scanner.nextInt()
    println("İsim: $name")
    println("Yaş: $age")
}