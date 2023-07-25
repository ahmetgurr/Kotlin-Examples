package com.example.kotlinuygulama

fun main() {
    val ogrenci=Ogrenci("Ahmet","GÜR","Son Sınıf")
    val ogrenci1=Ogrenci("mehmet","bal","Son Sınıf")
    val ogrenci2=Ogrenci("burak","malatyalı","birinci sınıf")
    val ogrenci3=Ogrenci("atakcı","gürün","mezun")
    yazdir(ogrenci)
    yazdir(ogrenci1)
    yazdir(ogrenci2)
    yazdir(ogrenci3)
}


fun yazdir(öğrenci: Ogrenci) {
    println("Ad: ${öğrenci.ad}")
    println("Soyad: ${öğrenci.soyad}")
    println("Sınıf: ${öğrenci.sınıf}")
}