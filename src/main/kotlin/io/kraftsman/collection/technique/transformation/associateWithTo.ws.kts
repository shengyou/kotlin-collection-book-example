package io.kraftsman.collection.technique.transformation

/**
 * associateWith() - 依 λ 轉換 Map 的 Value 後寫入指定 Collection
 */

// 建立範例資料
val numberList = listOf("one", "two", "three", "four")
val mutableNumberList = mutableMapOf("zero" to 4)

// 測試 APIs
numberList.associateWithTo(mutableNumberList) { it.length }
