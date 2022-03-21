package io.kraftsman.collection.technique.grouping

/**
 * filterNotNull() - 過濾出非 Null 值
 */

// 建立範例資料
var list = listOf("A", null, "B", null, "C")

// 測試 APIs
list.filterNotNull()
list.filter { it != null }
