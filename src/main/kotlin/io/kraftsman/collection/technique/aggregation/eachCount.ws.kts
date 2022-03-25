package io.kraftsman.collection.technique.aggregation

/**
 * eachCount() - 計算 Grouping 後每一組子 Collection 裡的數量
 */

// 建立範例資料
val numberStrings = listOf("one", "two", "three", "four", "five", "six")

// 測試 APIs
numberStrings.groupingBy { it.length }.eachCount()
