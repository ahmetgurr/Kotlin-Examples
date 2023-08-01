package com.example.kotlinuygulama.uygulama3

fun main() {
    val liste = listOf(1, 2, 3, 2, 4, 5, 3, 6)
    val duplicatesSet = findDuplicateElements(liste)
    println("tekrar eden: $duplicatesSet")
}

fun findDuplicateElements(list: List<Int>): HashSet<Int> {
    val uniqueSet = HashSet<Int>()
    val duplicatesSet = HashSet<Int>()

    for (element in list) {
        if (!uniqueSet.add(element)) {
            duplicatesSet.add(element)
        }
    }

    return duplicatesSet
}


