package io.kraftsman.collection.technique.retrieving.parts

/**
 * slice() - 依傳入的範圍截取 List 元素後回傳 List
 */

// 建立範例資料
val strings = listOf("one", "two", "three", "four", "five", "six")

// 測試 APIs
strings.slice(1..3)
strings.slice(0..4 step 2)
strings.slice(listOf(3, 0, 0))
strings.slice(setOf(3, 5, 0))
strings.slice(setOf(3, 0, 0))
