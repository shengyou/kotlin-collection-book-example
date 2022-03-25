package io.kraftsman.collection.technique.aggregation

/**
 * reduceIndexedOrNull() - 由左至右累進（有 Index），若空集合則回傳 Null
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)
val emptyNumbers = emptyList<Int>()
val listWithNothing = listOf<Int>()

// 測試 APIs
numbers.reduceIndexedOrNull { index, acc, i -> acc + (index * i) }
emptyNumbers.reduceIndexedOrNull { index, acc, i -> acc + (index * i) }
listWithNothing.reduceIndexedOrNull { index, acc, i -> acc + (index * i) }
