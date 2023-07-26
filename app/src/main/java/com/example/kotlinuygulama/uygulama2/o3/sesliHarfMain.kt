package com.example.kotlinuygulama.uygulama2.o3

import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)
    print("string ifade gir: ")
    val input = scanner.nextLine()
    scanner.close()

    val result = sesliHarfleriKaldir(input)
    println("sesli  harfler cikarildi: $result")

}

fun sesliHarfleriKaldir(metin: String): String{
    var sesliHarfler = "aeiouAEIOU"
    return metin.filter {
        it !in sesliHarfler
    }


}
