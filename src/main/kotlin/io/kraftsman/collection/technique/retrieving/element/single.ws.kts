package io.kraftsman.collection.technique.retrieving.element

/**
 * single() - 取出 Collection 裡的唯一元素，若是空 Collection 拋 NoSuchElementException，若多於一個則拋 IllegalArgumentException
 */

// 建立範例資料
val onlyOneNumber = listOf(2)
val numbers = listOf(2, 2, 3, 2, 2, 2)

// 測試 APIs
onlyOneNumber.single()
numbers.single { it != 2 }
