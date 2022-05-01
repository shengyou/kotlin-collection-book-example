package io.kraftsman.collection.technique.grouping

/**
 * distinct() - 去除重覆的元素
 */

// 建立範例資料
val numbers = listOf(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9)
val strings = listOf("Tommy", "John", "John", "Sean", "John", "Sean")

// 測試 APIs
numbers.distinct()
strings.distinct()

numbers.toSet().toList()
strings.toSet().toList()
