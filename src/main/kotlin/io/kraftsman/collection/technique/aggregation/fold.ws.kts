package io.kraftsman.collection.technique.aggregation

/**
 * fold() - 依給定的初始值由左向右累進
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)

// 測試 APIs
numbers.fold(100) { acc, i -> acc + i }
