package io.kraftsman.collection.technique.retrieving.parts

/**
 * sliceArray() - 依傳入的範圍截取 Array 元素後回傳 Array
 */

// 建立範例資料
val fruits = arrayOf(
    "Grape",
    "Muskmelon",
    "Pear",
    "Kumquat",
    "Coconut",
    "Avocado",
    "Tangerine"
)

// 示範使用方式
fruits.sliceArray(1..3).contentToString()
fruits.sliceArray((0..4 step 2).toList()).contentToString()

fruits.sliceArray(listOf(3, 0, 0)).contentToString()
fruits.sliceArray(setOf(3, 5, 0)).contentToString()
fruits.sliceArray(setOf(3, 0, 0)).contentToString()
