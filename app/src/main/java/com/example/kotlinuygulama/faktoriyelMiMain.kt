package com.example.kotlinuygulama

fun main() {
    val sayi = 3
    val factorialResult = fakt(sayi)
    println("$sayi sayısının faktöriyeli: $factorialResult")
}
fun fakt(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * fakt(n - 1)
    }


}