package io.kraftsman.collection.technique.retrieving.element

/**
 * randomOrNull() - 從集合隨機取出一個元素，若是 Empty 集合則回傳 Null
 */

// 建立範例資料
val numbers = mutableListOf(2, 3, 5, 6, 7)
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

// 測試 APIs
numbers.clear()
numbers.randomOrNull()

emptyList.randomOrNull()
nothingInList.randomOrNull()
