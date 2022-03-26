package io.kraftsman.collection.technique.retrieving.parts

/**
 * sliceArray() - 依傳入的範圍截取 Array 元素後回傳 Array
 */

// 建立範例資料
val strings = arrayOf("one", "two", "three", "four", "five", "six")

// 測試 APIs
strings.sliceArray(1..3)
strings.sliceArray((0..4 step 2).toSet())
strings.sliceArray(listOf(3, 0, 0))
strings.sliceArray(setOf(3, 5, 0))
strings.sliceArray(setOf(3, 0, 0))
