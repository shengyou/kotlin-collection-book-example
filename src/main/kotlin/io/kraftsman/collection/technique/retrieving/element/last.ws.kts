package io.kraftsman.collection.technique.retrieving.element

/**
 * last() - 取出 Collection 裡的最後一個元素，若是空 Collection 則拋出 NoSuchElementException
 */

// 建立範例資料
val numbers = listOf(2, 3, 5, 6, 7)
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

// 測試 APIs
numbers.last()
numbers[numbers.size - 1]

numbers.last { it < 6 }

emptyList.last()
nothingInList.last()

emptyList.last { it < 6 }
nothingInList.last { it < 6 }
