package io.kraftsman.collection.technique.aggregation

/**
 * reduceIndexed() - 由左至右累進（有 Index），若空集合則拋出 UnsupportedOperationException
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)
val strings = listOf("a", "b", "c", "d", "e")

// 測試 APIs
numbers.reduceIndexed { index, acc, i -> acc + (index * i) }
strings.reduceIndexed { index, acc, s -> "$acc, $index: $s" }
