package io.kraftsman.collection.technique.operation

/**
 * fill() - 以固定值填充 Collection 的內容
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 7, 9)
val numberArray = intArrayOf(1, 3, 5, 7, 9)

// 測試 APIs
numbers.fill(10)
numbers.replaceAll { 10 }

numberArray.fill(10, 0, 2)
