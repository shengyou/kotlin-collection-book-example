package io.kraftsman.collection.technique.retrieving.parts

/**
 * slice() - 依傳入的範圍截取 List 元素後回傳 List
 */

// 建立範例資料
val fruits = listOf(
    "Grape",
    "Muskmelon",
    "Pear",
    "Kumquat",
    "Coconut",
    "Avocado",
    "Tangerine"
)

// 測試 APIs
fruits.slice(1..3)
fruits.slice(0..4 step 2)

fruits.slice(listOf(3, 0, 0))
fruits.slice(setOf(3, 5, 0))
fruits.slice(setOf(3, 0, 0))
