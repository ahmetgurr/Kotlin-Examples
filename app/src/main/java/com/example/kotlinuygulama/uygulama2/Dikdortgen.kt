package com.example.kotlinuygulama.uygulama2

class Dikdortgen (val uzunluk: Double, val genislik: Double) {
    fun alan(): Double {
        return uzunluk * genislik
    }
    fun cevre(): Double {
        return 2 *(uzunluk + genislik)
    }
}