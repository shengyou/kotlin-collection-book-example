package io.kraftsman.collection.technique.retrieving.parts

/**
 * dropLast() - 從後面丟棄 n 個值
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four", "five", "six")

// 測試 APIs
numbers.dropLast(4)
numbers.dropLast(100)
