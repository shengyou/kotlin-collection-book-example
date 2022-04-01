package io.kraftsman.collection.technique.retrieving.element

/**
 * lastOrNull() - 取出 Collection 裡的最後一個元素，若是空 Collection 則回傳 Null
 */

// 建立範例資料
val numbers = listOf(2, 3, 5, 6, 7)
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

// 測試 APIs
numbers.lastOrNull()
emptyList.lastOrNull()
nothingInList.lastOrNull()

numbers.lastOrNull { it < 6 }
emptyList.firstOrNull { it < 6 }
nothingInList.firstOrNull { it < 6 }
