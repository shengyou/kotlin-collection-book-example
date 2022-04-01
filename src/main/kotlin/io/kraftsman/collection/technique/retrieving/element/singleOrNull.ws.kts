package io.kraftsman.collection.technique.retrieving.element

/**
 * singleOrNull() - 取出 Collection 裡的唯一元素，若是空 Collection 或多於一個則回傳 null
 */

// 建立範例資料
val numbers = listOf(2, 2, 3, 2, 2, 2)
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

// 測試 APIs
numbers.singleOrNull()
emptyList.singleOrNull()
nothingInList.singleOrNull()

numbers.singleOrNull { it > 5 }
emptyList.singleOrNull { it > 5 }
nothingInList.singleOrNull { it > 5 }
