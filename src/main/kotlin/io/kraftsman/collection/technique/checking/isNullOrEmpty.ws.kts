package io.kraftsman.collection.technique.checking

/**
 * 檢查 Collection 是否是 Null 或是空的 Collection？
 */

// 建立範例資料
var numbers: List<Int>? = null

// 測試 APIs
numbers.isNullOrEmpty()
numbers = listOf(1,2,3)
numbers.isNullOrEmpty()
