package io.kraftsman.collection.technique.aggregation

/**
 * reduceRightIndexedOrNull() - 由右至左累進（有 Index），若空集合則回傳 Null
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)
val emptyNumbers = emptyList<Int>()
val listWithNothing = listOf<Int>()

// 測試 APIs
numbers.reduceRightIndexedOrNull { index, i, acc -> acc + (index * i) }
emptyNumbers.reduceRightIndexedOrNull { index, i, acc -> acc + (index * i) }
listWithNothing.reduceRightIndexedOrNull { index, i, acc -> acc + (index * i) }
