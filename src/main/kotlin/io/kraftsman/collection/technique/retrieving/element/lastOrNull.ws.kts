package io.kraftsman.collection.technique.retrieving.element

/**
 * lastOrNull() - 取出集合裡最後一個元素，若是 Empty 集合則回傳 Null
 */

// 建立範例資料
val numbers = listOf(2, 3, 5, 6, 7)
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

// 示範使用方式
numbers.lastOrNull()
emptyList.lastOrNull()
nothingInList.lastOrNull()

numbers.lastOrNull { it < 6 }
emptyList.firstOrNull { it < 6 }
nothingInList.firstOrNull { it < 6 }
