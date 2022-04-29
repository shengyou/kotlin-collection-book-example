package io.kraftsman.collection.technique.ordering

/**
 * sortedBy() - 依傳入的 λ 正向排序
 */

// 建立範例資料
val fruits = listOf("Grape", "Muskmelon", "Kumquat", "Pear")

// 測試 APIs
fruits.sortedBy { it.length }
