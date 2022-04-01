package io.kraftsman.collection.technique.retrieving.element

/**
 * getOrNull() - 取出指定位置的元素，若 Index 不存在則回傳 Null
 */

// 建立範例資料
val listOfNames = listOf("Tom", "John", "Allen", "Sean")

// 測試 APIs
listOfNames.getOrNull(1)
listOfNames.getOrNull(10)
listOfNames.getOrNull(10) ?: "Unknown Person"
