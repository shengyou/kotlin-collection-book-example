package io.kraftsman.collection.technique.checking

/**
 * all() - 檢查 Collection 裡的元素是否全部通過條件？
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four")
val empty = emptyList<String>()

// 測試 APIs
numbers.all { it.endsWith("e") }

// Vacuous Truth
empty.all { it == "anything" } // true
