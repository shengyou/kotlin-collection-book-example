package io.kraftsman.collection.technique.checking

/**
 * any() - 檢查 Collection 裡是否有任一元素通過條件？
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four")
val empty = emptyList<String>()

// 測試 Collection 是否有任一元素（通過條件）？
numbers.any()
numbers.isEmpty()
numbers.isNotEmpty()

empty.any()
empty.isEmpty()
empty.isNotEmpty()

// 使用 λ 條件測試
numbers.any { it.endsWith("e") }
