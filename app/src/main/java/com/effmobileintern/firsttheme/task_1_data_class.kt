package com.effmobileintern.firsttheme

/**
 * data calss Key(
 * val field1: Int,
 * var field2: String
 * ) {
 * var field3: String? = null
 * }
 *
 *
 * Могут ли возникнуть какие-то проблемы, если мы будем использовать подобный класс
 * в качестве ключа для HashMap?
 */

fun main() {

    val key1 = Key(0, "0")
    val key2 = Key(1, "1")
    val key3 = Key(2, "2")

    val myMap = hashMapOf(
        key1 to "one value",
        key2 to "two value",
        key3 to "three value",
    )

    println("Good result: ${myMap[key1]}") // one value

    key1.field2 = "ddddd" // используем возможность изменения ключа

    println("Actual map: $myMap") // Key(field1=0, field2=ddddd)=one value, Key(field1=1, field2=1)=two value, Key(field1=2, field2=2)=three value
    println("Bad result: ${myMap[key1]}") // null

// Использование в хэш мапе изменяемых ключей приводит к ряду проблем,
// так как меняется хэш код ключа по которому осуществляется поиск,
// удаление и распределения значение в мапе.
// Теряется возможность поиска по ключу, если проблема глубока можно и не определить сразу,
// также нельзя удвлить по ключу,
// значение остается в мапе, может привести к лишним затратам при большом количестве элементов

}

data class Key(
    val field1: Int,
    var field2: String
) {
    var field3: String? = null
}