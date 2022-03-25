package io.kraftsman.collection.technique.aggregation

/**
 * reduceRightOrNull() - 由右至左累進，若空集合則回傳 Null
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)
val emptyNumbers = emptyList<Int>()
val listWithNothing = listOf<Int>()

// 測試 APIs
numbers.reduceRightOrNull { acc, i -> acc - i }
emptyNumbers.reduceRightOrNull { i, acc -> acc - i }
listWithNothing.reduceRightOrNull { i, acc -> acc - i }
