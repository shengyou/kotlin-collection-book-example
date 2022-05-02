package io.kraftsman.collection.technique.retrieving.element

/**
 * getOrNull() - 依索引取出集合內元素，若索引超出範圍則回傳 Null
 */

// 建立範例資料
val listOfNames = listOf("Tom", "John", "Allen", "Sean")

// 測試 APIs
listOfNames.getOrNull(1)
listOfNames.getOrNull(10)
listOfNames.getOrNull(10) ?: "Unknown Person"
