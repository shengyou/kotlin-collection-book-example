package io.kraftsman.collection.technique.checking

/**
 * none() - 檢查 Collection 裡的元素是否全部沒有通過條件？
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four")
val empty = emptyList<String>()

// 測試 Collection 是否沒有元素（通過條件）？
numbers.none()
numbers.isEmpty()
numbers.isNotEmpty()

empty.none()
empty.isEmpty()
empty.isNotEmpty()

// 使用 λ 條件測試
numbers.none { it.endsWith("a") }
