package io.kraftsman.collection.technique.aggregation

/**
 * foldRightIndexed() - 依給定的初始值由右向左累進（有 Index）
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)

// 測試 APIs
numbers.foldRightIndexed(100) { index, i, acc -> acc + (index * i) }
