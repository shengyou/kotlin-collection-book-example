package io.kraftsman.collection.technique.retrieving.parts

/**
 * zipWithNext() - 將前後相鄰的 2 個元素、每次移動一格截取
 */

// 建立範例資料
val strings = listOf("one", "two", "three", "four", "five")
val numbers = listOf(1, 2, 3, 4, 5)

// 測試 APIs
strings.zipWithNext()
numbers.zipWithNext { a, b -> a * b }
