package io.kraftsman.collection.technique.retrieving.element

/**
 * single() - 取出集合裡的唯一元素，若是 Empty 集合則拋 NoSuchElementException，若集合超過一個元素則拋 IllegalArgumentException
 */

// 建立範例資料
val onlyOneNumber = listOf(2)
val numbers = listOf(2, 2, 3, 2, 2, 2)

// 示範使用方式
onlyOneNumber.single()
numbers.single { it != 2 }
