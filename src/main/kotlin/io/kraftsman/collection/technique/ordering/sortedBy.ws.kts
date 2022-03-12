package io.kraftsman.collection.technique.ordering

/**
 * sortedBy() - 以傳入的 λ 正向排序
 */

// 建立範例資料
val string = listOf("one", "two", "three", "four", "five")

// 測試 APIs
string.sortedBy { it.length }
