package io.kraftsman.collection.technique.grouping

/**
 * filterNot() - 依條件反向過濾
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four")

// 測試 APIs
numbers.filterNot { it.length > 3 }
