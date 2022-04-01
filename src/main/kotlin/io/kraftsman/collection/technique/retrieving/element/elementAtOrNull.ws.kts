package io.kraftsman.collection.technique.retrieving.element

/**
 * elementAtOrNull() - 取出指定位置的元素，若 Index 不存在則回傳 Null
 */

// 建立範例資料
val listOfNames = setOf("Tom", "John", "Allen", "Sean")

// 測試 APIs
listOfNames.elementAtOrNull(1)
listOfNames.elementAtOrNull(10)
listOfNames.elementAtOrNull(10) ?: "Unknown Person"
