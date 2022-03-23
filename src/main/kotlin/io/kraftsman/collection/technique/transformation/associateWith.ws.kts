package io.kraftsman.collection.technique.transformation

/**
 * associateWith() - 依 λ 轉換 Map 的 Value
 */

// 建立範例資料
val numberList = listOf("one", "two", "three", "four")
val duplicateNumberList = listOf("one", "four", "two", "three", "two", "three", "four")

// 測試 APIs
numberList.associateWith { it.length }
duplicateNumberList.associateWith { it.length }
