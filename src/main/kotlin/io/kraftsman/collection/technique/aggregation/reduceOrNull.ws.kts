package io.kraftsman.collection.technique.aggregation

/**
 * reduceOrNull() - 由左至右累進，若空集合則回傳 Null
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)
val emptyNumbers = emptyList<Int>()
val listWithNothing = listOf<Int>()

// 測試 APIs
numbers.reduceOrNull { acc, i -> acc + i }
emptyNumbers.reduceOrNull { acc, i -> acc + i }
listWithNothing.reduceOrNull { acc, i -> acc + i }