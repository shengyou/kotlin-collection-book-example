package io.kraftsman.collection.technique.retrieving.element

/**
 * lastIndexOf() - 搜尋最後一個符合指定元素的索引，找不到就回傳 -1
 */

// 建立範例資料
val numbers = listOf(5, 2, 2, 6, 2, 3, 7)

// 測試 APIs
numbers.lastIndexOf(2)
numbers.lastIndexOf(10)
