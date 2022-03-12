package io.kraftsman.collection.technique.ordering

/**
 * sortedByDescending() - 以傳入的 λ 反向排序
 */

// 建立範例資料
val string = listOf("one", "two", "three", "four", "five")

// 測試 APIs
string.sortedByDescending { it.last() }
