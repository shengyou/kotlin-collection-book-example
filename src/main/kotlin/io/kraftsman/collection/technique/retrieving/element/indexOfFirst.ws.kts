package io.kraftsman.collection.technique.retrieving.element

/**
 * indexOfFirst() - 依傳入條件搜尋第一個符合條件的索引，找不到就回傳 -1
 */

// 建立範例資料
val numbers = listOf(5, 2, 2, 6, 2, 3, 7)

// 測試 APIs
numbers.indexOfFirst { it < 3 }
numbers.indexOfFirst { it > 100 }
