package io.kraftsman.collection.technique.checking

/**
 * contains() - 檢查 Collection 裡的是否包含某個元素？
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four", "five", "six")

// 測試 APIs
numbers.contains("four")
numbers.contains("seven")
"four" in numbers
