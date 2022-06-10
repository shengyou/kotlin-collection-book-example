package io.kraftsman.collection.technique.retrieving.element

/**
 * indexOfLast() - 依傳入條件搜尋最後一個符合條件的索引，找不到就回傳 -1
 */

// 建立範例資料
val numbers = listOf(5, 2, 2, 6, 2, 3, 7)

// 示範使用方式
numbers.indexOfLast { it < 3 }
numbers.indexOfLast { it > 100 }
