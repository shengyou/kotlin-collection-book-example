package io.kraftsman.collection.technique.retrieving.element

/**
 * firstOrNull() - 取出 Collection 裡的第一個元素，若是空 Collection 則回傳 Null
 */

// 建立範例資料
val numbers = listOf(2, 3, 5, 6, 7)
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

// 測試 APIs
numbers.firstOrNull()
emptyList.firstOrNull()
nothingInList.firstOrNull()

numbers.firstOrNull { it > 3 }
emptyList.firstOrNull { it > 3 }
nothingInList.firstOrNull { it > 3 }
