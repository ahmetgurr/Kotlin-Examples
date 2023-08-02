package com.example.kotlinuygulama.uygulama3.uygulama3gun2

class Mudur(private val calisanSayisi: Int) : Calisan {
    override fun maasHesapla(): Double {
        val temelMaas = 22000.0
        return temelMaas + calisanSayisi*5
    }
}