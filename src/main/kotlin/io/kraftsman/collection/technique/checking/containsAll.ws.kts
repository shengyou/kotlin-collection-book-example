package io.kraftsman.collection.technique.checking

/**
 * containsAll() - 檢查 Collection 裡的是否包含某些元素？
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four", "five", "six")

// 測試 APIs
numbers.containsAll(listOf("four"))
numbers.containsAll(listOf("seven"))
numbers.containsAll(listOf("one", "four"))
numbers.containsAll(listOf("one", "seven"))
