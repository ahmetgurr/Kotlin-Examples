package com.example.kotlinuygulama.uygulama2.o2

class Otomobil (hiz: Int, yakitTuketimi: Double, val kapiSayisi: Int,val bagajHacm: Double) : Arac(hiz, yakitTuketimi) {
    fun kapiKitle() {
        println("kapilar kitlendi!")

    }
    fun bagajAc(){
        println("Bagaj acildi!")
    }
}