package com.effmobileintern.firsttheme

import android.util.Log

/**
 * Написать extention-функцию для List, которая в рантайме будет искать Int в списке типа Any и возвращать его.
 * Заранее подготовить список, наполненный разными классами(5-10 шт будет достаточно).
 * По нажатию на кнопку выводить результат в логи (не использовать рефлексию).
 */

//Вызываем в MainActivity
fun List<Any>.getAllInt() {
    //просто проходимся по листу и сравниваем с типом и ищем Int
    forEach { item ->
        if (item is Int) {
            Log.i("MyLog", "Int type item: $item")
        }
    }
}

val mockList = listOf(
    "Hello",
    42,
    3.14,
    true,
    listOf(1, 2, 3),
    'A',
    100,
    mapOf("key" to "value"),
    7L
)