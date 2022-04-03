package io.kraftsman.collection.technique.operation

/**
 * addAll() - 將數個元素新增至 Collection 的指定位置
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 6, 7)

// 測試 APIs
numbers.addAll(listOf(12, 11, 10))
numbers.addAll(2, listOf(100, 101, 102))
