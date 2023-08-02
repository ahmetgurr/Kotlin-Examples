package com.example.kotlinuygulama.uygulama3.uygulama3gun2

fun main() {
    val first = hashSetOf("1", "2", "3")
    val targetSet = hashSetOf("4", "5")
    addHashSetElements(first, targetSet)

    println("Target HashSet after adding elements:")
    targetSet.forEach { print("$it ,") }
}


fun <T> addHashSetElements(sourceSet: HashSet<T>, targetSet: HashSet<T>) {
    targetSet.addAll(sourceSet)
}
