package com.example.kotlinuygulama.uygulama2.o2

fun main() {
    val arac = Arac(50,2.1)
    arac.kalkis()

    val otomobil = Otomobil(120, 7.0, 2,200.0)
    println("Otomobilin hızı:${otomobil.hiz} Bagaj Hacmi: ${otomobil.bagajHacm}, ve Kapi sayısı: ${otomobil.kapiSayisi}   ")
    otomobil.kalkis()
    otomobil.kapiKitle()
    otomobil.bagajAc()


    val arac2: Arac = Otomobil(90, 6.5, 4,100.0)
    arac2.kalkis()

}