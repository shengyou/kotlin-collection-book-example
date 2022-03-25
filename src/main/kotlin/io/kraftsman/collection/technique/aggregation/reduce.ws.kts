package io.kraftsman.collection.technique.aggregation

/**
 * reduce() - 由左至右累進，若空集合則拋出 UnsupportedOperationException
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)
val strings = listOf("a", "b", "c", "d", "e")

// 測試 APIs
numbers.reduce { acc, i -> acc + i }
numbers.sum()

strings.reduce { acc, i -> "$acc, $i" }
strings.joinToString()
