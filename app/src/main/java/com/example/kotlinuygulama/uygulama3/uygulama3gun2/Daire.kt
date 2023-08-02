package com.example.kotlinuygulama.uygulama3.uygulama3gun2

import java.lang.Math.PI

class Daire (private val yaricap: Double) : Shape {
    override fun alanHesapla(): Double {
        return 3.14 * yaricap * yaricap
    }
}