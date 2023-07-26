package com.example.kotlinuygulama.uygulama2.o5

import java.util.*

fun main() {
    val names = arrayListOf("ahmet", "mehmet", "ayşe", "feyza", "emir")
    printNames(names)

    val scanner = Scanner(System.`in`)
    print("degistirmek istediginiz isim indexini girin: (0-${names.size - 1}): ")
    val index = scanner.nextInt()

    if (index < 0 || index >= names.size) {
        println("gecerli bir index numarasi gir!")
        return
    }

    print("Yeni ismi girin: ")
    val yeniIsim = scanner.next()

    updateName(names, index, yeniIsim)
    printNames(names)

    scanner.close()
}




fun printNames(names: ArrayList<String>) {
    println("yeni isim listesi:")
    for (i in names.indices) {
        println("$i: ${names[i]}")
    }
}

fun updateName(names: ArrayList<String>, index: Int, yeniIsim: String) {
    names[index] = yeniIsim
}
