package io.kraftsman.collection.technique.operation

/**
 * replaceAll() - 將所有元素都套用運算邏輯後更新
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 7, 9)

// 測試 APIs
numbers.replaceAll { it * 2 }
