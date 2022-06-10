package io.kraftsman.collection.technique.retrieving.element

/**
 * elementAt() - 取出集合裡指定索引位置的元素，若索引超出範圍則拋出 IndexOutOfBoundsException
 */

// 建立範例資料
val setOfNames = setOf("Tom", "John", "Allen", "Sean")

// 示範使用方式
setOfNames.elementAt(1)
