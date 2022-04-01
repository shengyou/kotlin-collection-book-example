package io.kraftsman.collection.technique.retrieving.element

/**
 * first() - 取出 Collection 裡的第一個元素，若是空 Collection 則拋出 NoSuchElementException
 */

// 建立範例資料
val numbers = listOf(2, 3, 5, 6, 7)
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

// 測試 APIs
numbers.first()
numbers[0]

numbers.first { it > 3 }

emptyList.first()
nothingInList.first()

emptyList.first { it > 3 }
nothingInList.first { it > 3 }
