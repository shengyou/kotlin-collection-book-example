package io.kraftsman.collection.technique.retrieving.element

/**
 * findLast() - 依傳入 λ 搜尋最後一個符合條件元素回傳，若找不到就回傳 Null
 */

// 建立範例資料
val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

// 示範使用方式
words.findLast { it.startsWith("some") }
words.findLast { it.startsWith("any") }
