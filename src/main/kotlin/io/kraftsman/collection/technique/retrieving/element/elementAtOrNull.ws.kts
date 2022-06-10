package io.kraftsman.collection.technique.retrieving.element

/**
 * elementAtOrNull() - 取出集合裡指定位置的元素，若索引超出範圍則回傳 Null
 */

// 建立範例資料
val setOfNames = setOf("Tom", "John", "Allen", "Sean")

// 示範使用方式
setOfNames.elementAtOrNull(1)
setOfNames.elementAtOrNull(10)
setOfNames.elementAtOrNull(10) ?: "Unknown Person"
