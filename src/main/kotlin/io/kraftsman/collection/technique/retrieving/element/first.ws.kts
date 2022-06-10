package io.kraftsman.collection.technique.retrieving.element

/**
 * first() - 取出集合裡的第一個元素，若是 Empty 集合則拋出 NoSuchElementException
 */

// 建立範例資料
val numbers = listOf(2, 3, 5, 6, 7)
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

// 示範使用方式
numbers.first()
numbers[0]

numbers.first { it > 3 }

emptyList.first()
emptyList.first { it > 3 }

nothingInList.first()
nothingInList.first { it > 3 }
