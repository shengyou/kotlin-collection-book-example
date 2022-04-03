package io.kraftsman.collection.technique.operation

/**
 * sortByDescending() - 以傳入的 λ 反向排序
 */

// 建立範例資料
val strings = mutableListOf("one", "two", "three", "four", "five")

// 測試 APIs
strings.sortByDescending { it.length }
