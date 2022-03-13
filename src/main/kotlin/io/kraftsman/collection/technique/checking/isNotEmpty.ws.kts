package io.kraftsman.collection.technique.checking

/**
 * isNotEmpty() - 檢查 Collection 是否不是空的？
 */

// 建立範例資料
val numbers = mutableListOf(1, 2, 3, 4, 5)

// 測試 APIs
numbers.isNotEmpty()
numbers.clear()
numbers.isNotEmpty()
numbers.addAll(listOf(6, 7, 8))
numbers.isNotEmpty()
