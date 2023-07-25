package com.example.kotlinuygulama

class Elma (ad: String, tatliLikDerecesi: Int, val vitaminDegeri: String) : Meyve(ad, tatliLikDerecesi) {
    fun yiyebilir() {
        println("$ad yiyebilir.")
    }
}