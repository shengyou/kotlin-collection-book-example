package io.kraftsman.collection.technique.aggregation

/**
 * foldIndexed() - 依給定的初始值由左向右累進（有 Index）
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)

// 測試 APIs
numbers.foldIndexed(100) { index, acc, i -> acc + (index * i) }
