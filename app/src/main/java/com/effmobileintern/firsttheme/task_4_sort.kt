package com.effmobileintern.firsttheme

/**
 * Написать шейкерную сортировку для List<Int?>.
 * Учесть кейсы, когда переданный массив = null,
 * некоторые эл-ты массива = null - пушить такие эл-ты в конец сортированного списка.
 */

fun shakerSort(input: List<Int?>?): List<Int?> {
    if (input == null) return emptyList()

    val list = input.toMutableList()
    val n = list.size

    var left = 0
    var right = n - 1
    var swapped: Boolean

    fun lessOrEqual(a: Int?, b: Int?): Boolean {
        return when {
            a == null && b == null -> true
            a == null -> false
            b == null -> true
            else -> a <= b
        }
    }

    do {
        swapped = false

        for (i in left until right) {
            if (!lessOrEqual(list[i], list[i + 1])) {
                val temp = list[i]
                list[i] = list[i + 1]
                list[i + 1] = temp
                swapped = true
            }
        }
        right--

        if (!swapped) break

        swapped = false

        for (i in right downTo left + 1) {
            if (!lessOrEqual(list[i - 1], list[i])) {
                val temp = list[i]
                list[i] = list[i - 1]
                list[i - 1] = temp
                swapped = true
            }
        }
        left++

    } while (swapped)

    return list
}

fun main(){
    val list: List<Int?>? = listOf(3, null, 1, 7, null, 5, 2, 0)

    val sorted = shakerSort(list)
    println(sorted)
}