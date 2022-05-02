package io.kraftsman.collection.technique.retrieving.element

/**
 * firstOrNull() - 取出集合裡的第一個元素，若為 Empty 集合則回傳 Null
 */

// 建立範例資料
val numbers = listOf(2, 3, 5, 6, 7)
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

// 測試 APIs
numbers.firstOrNull()
numbers.firstOrNull { it > 3 }

emptyList.firstOrNull()
nothingInList.firstOrNull()

emptyList.firstOrNull { it > 3 }
nothingInList.firstOrNull { it > 3 }
