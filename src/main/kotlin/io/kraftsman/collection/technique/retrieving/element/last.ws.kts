package io.kraftsman.collection.technique.retrieving.element

/**
 * last() - 取出集合裡最後一個元素，若是 Empty 集合則拋出 NoSuchElementException
 */

// 建立範例資料
val numbers = listOf(2, 3, 5, 6, 7)
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

// 示範使用方式
numbers.last()
numbers[numbers.size - 1]

numbers.last { it < 6 }

emptyList.last()
emptyList.last { it < 6 }

nothingInList.last()
nothingInList.last { it < 6 }
